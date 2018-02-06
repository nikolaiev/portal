package com.school.controllers;

import com.school.entities.Forum;
import com.school.services.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/formus/")
public class ForumController implements RestApiController<Forum> {

    @Autowired
    ForumService forumService;

    @Override
    public Iterable<Forum> getLimitOffset(int limit, int offset) {
        return null;
    }

    @Override
    public Forum getById(long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Forum update(Forum one) {
        return null;
    }

    @Override
    public Forum create(Forum one) {
        return null;
    }
}
