package com.school.repositories;

import com.school.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepository extends JpaRepository<Schedule,Long> {
}
