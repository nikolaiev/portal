package com.school.services;

import com.school.entities.Message;
import com.school.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageService implements GenericService<Message>{
    @Autowired
    MessageRepository messageRepository;

    @Override
    public Optional<Message> getById(long id) {
        return Optional.ofNullable(messageRepository.findOne(id));
    }

    @Override
    public Iterable<Message> getAllPageOffsetSize(int pageOffset, int pageSize) {
        return messageRepository.findAll(new PageRequest(pageOffset,pageSize));
    }

    @Override
    public Message create(Message one) {
        return messageRepository.save(one);
    }

    @Override
    public Message update(Message one) {
        return messageRepository.save(one);
    }

    @Override
    public void deleteById(long id) {
        messageRepository.delete(id);
    }
}
