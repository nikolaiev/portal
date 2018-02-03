package com.school.security;

import com.school.entities.User;
import com.school.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
    private UserService userService;

    @Autowired
    public CustomAuthenticationProvider(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();

        User currentUser = userService.getByEmail(username);

        if (currentUser == null) {
            throw new BadCredentialsException("{\"error\":\"login_auth_err\"}");
        }

        if (!userService.isAuthenticated(currentUser, password)) {
            throw new BadCredentialsException("{\"error\":\"password_auth_err\"}");
        }

        return AuthenticationFactory.createAuthentication(currentUser);
    }

    @Override
    public boolean supports(Class<?> arg0) {
        return true;
    }
}
