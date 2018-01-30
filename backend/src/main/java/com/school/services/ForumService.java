package com.school.services;

import com.school.repositories.ForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForumService {
    @Autowired
    ForumRepository forumRepository;
}
