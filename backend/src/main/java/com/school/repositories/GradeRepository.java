package com.school.repositories;


import com.school.entities.Grade;
import org.springframework.data.repository.CrudRepository;

public interface GradeRepository extends CrudRepository<Grade,Long> {
}
