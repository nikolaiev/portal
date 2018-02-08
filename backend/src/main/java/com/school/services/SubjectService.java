package com.school.services;

import com.school.entities.Subject;
import com.school.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubjectService implements GenericService<Subject> {
    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public Optional<Subject> getById(long id) {
        return Optional.ofNullable(subjectRepository.findOne(id));
    }

    @Override
    public Iterable<Subject> getAllPageOffsetSize(int pageOffset, int pageSize) {
        return subjectRepository.findAll(new PageRequest(pageOffset,pageSize));
    }

    @Override
    public Subject create(Subject one) {
        return subjectRepository.save(one);
    }

    @Override
    public Subject update(Subject one) {
        return subjectRepository.save(one);
    }

    @Override
    public void deleteById(long id) {
        subjectRepository.delete(id);
    }
}
