package com.school.controllers;

import com.school.entities.Subject;
import com.school.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/subject")
public class SubjectController implements RestApiController<Subject> {
    @Autowired
    SubjectService subjectService;

    @Override
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Iterable<Subject> getLimitOffset(@RequestParam(value = "page_numb",defaultValue = "0") int pageOffset, @RequestParam(value = "page_size",defaultValue = "20") int pageSize) {
        return subjectService.getAllPageOffsetSize(pageOffset, pageSize);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Subject getById(@PathVariable  long id) {
        //TODO not found request processing
        return subjectService.getById(id).orElse(null);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteById(@PathVariable long id) {
        //TODO true false result??
        subjectService.deleteById(id);
    }

    //TODO think is id necessary
    @Override
    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public Subject update(@RequestBody Subject one) {
        return subjectService.update(one);
    }

    @Override
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public Subject create(@RequestBody Subject one) {
        return subjectService.create(one);
    }
}
