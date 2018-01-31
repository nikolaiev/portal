package com.school.repositories;


import com.school.entities.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News,Long>{
}
