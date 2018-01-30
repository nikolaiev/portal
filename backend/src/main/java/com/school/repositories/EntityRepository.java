package com.school.repositories;

import com.school.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EntityRepository  extends CrudRepository<Event,Long>{

}
