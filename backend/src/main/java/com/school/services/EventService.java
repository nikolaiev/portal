package com.school.services;

import com.school.entities.Event;
import com.school.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventService implements GenericService<Event>{
    @Autowired
    EventRepository eventRepository;


    @Override
    public Optional<Event> getById(long id) {
        return Optional.ofNullable(eventRepository.findOne(id));
    }

    @Override
    public void deleteById(long id) {
        eventRepository.delete(id);
    }

    @Override
    public Iterable<Event> getAllPageOffsetSize(int pageOffset, int pageSize) {
        return eventRepository.findAll(new PageRequest(pageOffset,pageSize));
    }

    @Override
    public Event update(Event one) {
        return eventRepository.save(one);
    }

    @Override
    public Event create(Event one) {
        return eventRepository.save(one);
    }
}
