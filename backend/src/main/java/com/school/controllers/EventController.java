package com.school.controllers;

import com.school.entities.Event;
import com.school.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/events")
public class EventController implements RestApiController<Event> {
    @Autowired
    EventService eventService;

    @Override
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Iterable<Event> getLimitOffset(@RequestParam(value = "page_numb",defaultValue = "0") int pageOffset, @RequestParam(value = "page_size",defaultValue = "20") int pageSize) {
        return eventService.getAllPageOffsetSize(pageOffset, pageSize);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Event getById(@PathVariable  long id) {
        //TODO not found request processing
        return eventService.getById(id).orElse(null);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteById(@PathVariable long id) {
        //TODO true false result??
        eventService.deleteById(id);
    }

    //TODO think is id necessary
    @Override
    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public Event update(@RequestBody Event one) {
        return eventService.update(one);
    }

    @Override
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public Event create(@RequestBody Event one) {
        return eventService.create(one);
    }
}
