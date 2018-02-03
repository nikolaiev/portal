package com.school.services;

import com.school.entities.User;

public interface UserService {
    User getByEmail(String email);
    boolean isAuthenticated(User user, String password);
}
