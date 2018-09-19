package com.school.repositories;

import com.school.entities.User;
import com.school.entities.UserType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Page<User> findByType(UserType type, Pageable pageable);
    Optional<User> findByEmail(String email);
}
