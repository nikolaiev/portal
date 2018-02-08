package com.school.services;

import com.school.entities.User;
import com.school.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements GenericService<User> {
    @Autowired
    UserRepository userRepository;

    @Override
    public Optional<User> getById(long id) {
        return Optional.ofNullable(userRepository.findOne(id));
    }

    @Override
    public Iterable<User> getAllPageOffsetSize(int pageOffset, int pageSize) {
        return userRepository.findAll(new PageRequest(pageOffset,pageSize));
    }

    @Override
    public User create(User one) {
        return userRepository.save(one);
    }

    @Override
    public User update(User one) {
        return userRepository.save(one);
    }

    @Override
    public void deleteById(long id) {
        userRepository.delete(id);
    }
}
