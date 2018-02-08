package com.school.repositories;

import com.school.entities.Forum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ForumRepository extends JpaRepository<Forum,Long> {
}
