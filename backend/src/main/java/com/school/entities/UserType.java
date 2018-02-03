package com.school.entities;

import org.springframework.security.core.GrantedAuthority;

public enum UserType implements GrantedAuthority {
    CONTENT_MANAGER,
    ADMIN;


    @Override
    public String getAuthority() {
        return name();
    }
}
