package com.school.services;

import com.school.entities.User;
import com.school.entities.UserType;
import com.school.exceptions.InvalidParamException;
import com.school.repositories.UserRepository;
import org.apache.commons.lang3.EnumUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DefaultUserService implements UserService {
    private static final String WRONG_USER_TYPE_MESSAGE_TITLE = "Wrong user type";
    private static final String WRONG_USER_TYPE_MESSAGE_DETAILS = "User type should be onу of the following types: teacher, admin or content_manager";
    private static final String WRONG_USER_TYPE_POINTER = "";

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
    public Page<User> getAllUsersByRole(String role, int pageOffset, int pageSize) {
        if(EnumUtils.isValidEnum(UserType.class, role)) {
            UserType userType = EnumUtils.getEnum(UserType.class, role);
            return userRepository.findByType(userType, new PageRequest(pageOffset,pageSize));
        }

        throw InvalidParamException.builder()
                .detail(WRONG_USER_TYPE_MESSAGE_DETAILS)
                .title(WRONG_USER_TYPE_MESSAGE_TITLE)
                .pointer(WRONG_USER_TYPE_POINTER)
                .build();
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
