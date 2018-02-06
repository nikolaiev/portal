package com.school.services;

import com.school.entities.Schedule;
import com.school.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ScheduleService implements GenericService<Schedule> {
    @Autowired
    ScheduleRepository scheduleRepository;

    @Override
    public Optional<Schedule> getById(long id) {
        return null;
    }

    @Override
    public Iterable<Schedule> getAllPageOffsetSize(int pageOffset, int pageSize) {
        return null;
    }

    @Override
    public Schedule create(Schedule one) {
        return null;
    }

    @Override
    public Schedule update(Schedule one) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
