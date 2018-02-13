package com.school.services;

import com.school.entities.User;
import org.springframework.data.domain.Page;

public interface UserService extends GenericService<User> {
    Page<User> getAllUsersByRole(String role, int pageOffset, int pageSize);
}
