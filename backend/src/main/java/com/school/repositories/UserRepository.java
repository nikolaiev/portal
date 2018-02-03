package com.school.repositories;

import com.school.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
    User findByEmail(String email);
}
