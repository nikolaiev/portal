package com.school.config;

import com.school.security.DefaultAuthenticationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfTokenRepository;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackages = "com.school.security")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                /*.antMatchers("/").authenticated()
                .mvcMatchers(HttpMethod.POST, "/login").permitAll()
                .mvcMatchers(HttpMethod.POST, "/register").permitAll()*/
                .anyRequest().authenticated()
                //.antMatchers("/info").authenticated()
                .and()
                .formLogin()
                    .loginPage("/login")
                    .permitAll()
                    .loginProcessingUrl("/login")
                    .defaultSuccessUrl("/")
                    .failureUrl("/login.html?error=true")
                .and()
                .logout()
                    .permitAll()
                    .logoutSuccessUrl("/login")
                    .invalidateHttpSession(true)
                    .clearAuthentication(true)
                .and()
                .csrf()
                    .csrfTokenRepository(csrfTokenRepository())
                .and()
                .httpBasic()
                .and()
                .addFilterBefore(authenticationFilter(authenticationManagerBean()), DefaultAuthenticationFilter.class);
    }

    @Bean
    public DefaultAuthenticationFilter authenticationFilter(AuthenticationManager authenticationManager) {
        return new DefaultAuthenticationFilter(authenticationManager);
    }

    @Bean(name = "authManager")
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    private CsrfTokenRepository csrfTokenRepository() {
        return CookieCsrfTokenRepository.withHttpOnlyFalse();
    }
}
