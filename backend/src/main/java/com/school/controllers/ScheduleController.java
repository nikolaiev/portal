package com.school.controllers;

import com.school.entities.Schedule;
import com.school.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/schedules")
public class ScheduleController implements RestApiController<Schedule> {
    @Autowired
    ScheduleService scheduleService;

    @Override
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Iterable<Schedule> getLimitOffset(@RequestParam(value = "page_numb",defaultValue = "0") int pageOffset, @RequestParam(value = "page_size",defaultValue = "20") int pageSize) {
        return scheduleService.getAllPageOffsetSize(pageOffset, pageSize);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Schedule getById(@PathVariable  long id) {
        //TODO not found request processing
        return scheduleService.getById(id).orElse(null);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteById(@PathVariable long id) {
        //TODO true false result??
        scheduleService.deleteById(id);
    }

    //TODO think is id necessary
    @Override
    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public Schedule update(@RequestBody Schedule one) {
        return scheduleService.update(one);
    }

    @Override
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public Schedule create(@RequestBody Schedule one) {
        return scheduleService.create(one);
    }
}

