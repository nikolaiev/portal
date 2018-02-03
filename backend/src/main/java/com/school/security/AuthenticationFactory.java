package com.school.security;

import com.school.entities.User;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class AuthenticationFactory {
    private AuthenticationFactory() {
    }

    public static Authentication createAuthentication(User user) {
        UserDetails userDetails = createUserDetails(user);
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        return new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword(), authorities);
    }

    private static UserDetails createUserDetails(User user) {
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(), user.getPassword(), Collections.singleton(user.getType())
        );
    }
}
