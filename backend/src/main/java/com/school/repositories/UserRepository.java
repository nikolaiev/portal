package com.school.repositories;

import com.school.entities.User;
import com.school.entities.UserType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    Page<User> findByType(UserType type, Pageable pageable);
}
