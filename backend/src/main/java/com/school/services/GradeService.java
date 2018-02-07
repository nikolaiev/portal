package com.school.services;

import com.school.entities.Grade;
import com.school.repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GradeService implements GenericService<Grade> {
    @Autowired
    GradeRepository gradeRepository;

    @Override
    public Optional<Grade> getById(long id) {
        return Optional.ofNullable(gradeRepository.getOne(id));
    }

    @Override
    public Iterable<Grade> getAllPageOffsetSize(int pageOffset, int pageSize) {
        return gradeRepository.findAll(new PageRequest(pageOffset,pageSize));
    }

    @Override
    public Grade create(Grade one) {
        return gradeRepository.save(one);
    }

    @Override
    public Grade update(Grade one) {
        return gradeRepository.save(one);
    }

    @Override
    public void deleteById(long id) {
        gradeRepository.delete(id);
    }
}
