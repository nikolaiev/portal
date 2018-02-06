package com.school.services;

import com.school.entities.User;
import com.school.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements GenericService<User> {
    @Autowired
    UserRepository userRepository;

    @Override
    public Optional<User> getById(long id) {
        return null;
    }

    @Override
    public Iterable<User> getAllPageOffsetSize(int pageOffset, int pageSize) {
        return null;
    }

    @Override
    public User create(User one) {
        return null;
    }

    @Override
    public User update(User one) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
