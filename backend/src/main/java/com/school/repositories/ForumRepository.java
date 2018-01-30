package com.school.repositories;

import com.school.entities.Forum;
import org.springframework.data.repository.CrudRepository;

public interface ForumRepository extends CrudRepository<Forum,Long> {
}
