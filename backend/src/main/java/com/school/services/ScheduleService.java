package com.school.services;

import com.school.entities.Schedule;
import com.school.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ScheduleService implements GenericService<Schedule> {
    @Autowired
    ScheduleRepository scheduleRepository;

    @Override
    public Optional<Schedule> getById(long id) {
        return Optional.ofNullable(scheduleRepository.findOne(id));
    }

    @Override
    public Iterable<Schedule> getAllPageOffsetSize(int pageOffset, int pageSize) {
        return scheduleRepository.findAll(new PageRequest(pageOffset,pageSize));
    }

    @Override
    public Schedule create(Schedule one) {
        return scheduleRepository.save(one);
    }

    @Override
    public Schedule update(Schedule one) {
        return scheduleRepository.save(one);
    }

    @Override
    public void deleteById(long id) {
        scheduleRepository.delete(id);
    }
}
