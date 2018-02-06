package com.school.services;

import com.school.entities.Grade;
import com.school.repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GradeService implements GenericService<Grade> {
    @Autowired
    GradeRepository gradeRepository;

    @Override
    public Optional<Grade> getById(long id) {
        return null;
    }

    @Override
    public Iterable<Grade> getAllPageOffsetSize(int pageOffset, int pageSize) {
        return null;
    }

    @Override
    public Grade create(Grade one) {
        return null;
    }

    @Override
    public Grade update(Grade one) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
