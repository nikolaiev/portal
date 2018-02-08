package com.school.controllers;

import com.school.entities.Grade;
import com.school.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grade")
public class GradeController implements RestApiController<Grade> {
    @Autowired
    GradeService gradeService;

    @Override
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Iterable<Grade> getLimitOffset(@RequestParam(value = "page_numb",defaultValue = "0") int pageOffset, @RequestParam(value = "page_size",defaultValue = "20") int pageSize) {
        return gradeService.getAllPageOffsetSize(pageOffset, pageSize);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Grade getById(@PathVariable  long id) {
        //TODO not found request processing
        return gradeService.getById(id).orElse(null);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteById(@PathVariable long id) {
        //TODO true false result??
        gradeService.deleteById(id);
    }

    //TODO think is id necessary
    @Override
    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public Grade update(@RequestBody Grade one) {
        return gradeService.update(one);
    }

    @Override
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public Grade create(@RequestBody Grade one) {
        return gradeService.create(one);
    }
}
