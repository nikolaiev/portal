package com.school.repositories;

import com.school.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
