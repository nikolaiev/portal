package com.school.services;

import com.school.entities.Forum;
import com.school.repositories.ForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ForumService implements  GenericService<Forum> {
    @Autowired
    ForumRepository forumRepository;

    @Override
    public Optional<Forum> getById(long id) {
        return null;
    }

    @Override
    public Iterable<Forum> getAllPageOffsetSize(int limit, int offset) {
        return null;
    }

    @Override
    public Forum create(Forum one) {
        return null;
    }

    @Override
    public Forum update(Forum one) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}