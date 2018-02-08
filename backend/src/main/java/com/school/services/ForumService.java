package com.school.services;

import com.school.entities.Forum;
import com.school.repositories.ForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ForumService implements  GenericService<Forum> {
    @Autowired
    ForumRepository forumRepository;

    @Override
    public Optional<Forum> getById(long id) {
        return Optional.ofNullable(forumRepository.getOne(id));
    }

    @Override
    public Iterable<Forum> getAllPageOffsetSize(int pageOffset, int pageSize) {
        return forumRepository.findAll(new PageRequest(pageOffset,pageSize));
    }

    @Override
    public Forum create(Forum one) {
        return forumRepository.save(one);
    }

    @Override
    public Forum update(Forum one) {
        return forumRepository.save(one);
    }

    @Override
    public void deleteById(long id) {
        forumRepository.delete(id);
    }
}