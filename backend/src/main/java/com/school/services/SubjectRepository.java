package com.school.services;

import com.school.entities.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubjectRepository implements GenericService<Subject> {
    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public Optional<Subject> getById(long id) {
        return null;
    }

    @Override
    public Iterable<Subject> getAllPageOffsetSize(int pageOffset, int pageSize) {
        return null;
    }

    @Override
    public Subject create(Subject one) {
        return null;
    }

    @Override
    public Subject update(Subject one) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
