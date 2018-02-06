package com.school.services;

import com.school.entities.Message;
import com.school.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageService implements GenericService<Message>{
    @Autowired
    MessageRepository messageRepository;

    @Override
    public Optional<Message> getById(long id) {
        return null;
    }

    @Override
    public Iterable<Message> getAllPageOffsetSize(int pageOffset, int pageSize) {
        return null;
    }

    @Override
    public Message create(Message one) {
        return null;
    }

    @Override
    public Message update(Message one) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
