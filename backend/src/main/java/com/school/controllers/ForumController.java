package com.school.controllers;

import com.school.entities.Forum;
import com.school.services.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/forum")
public class ForumController implements RestApiController<Forum> {

    @Autowired
    ForumService forumService;

    @Override
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Iterable<Forum> getLimitOffset(@RequestParam(value = "page_numb",defaultValue = "0") int pageOffset, @RequestParam(value = "page_size",defaultValue = "20") int pageSize) {
        return forumService.getAllPageOffsetSize(pageOffset, pageSize);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Forum getById(@PathVariable  long id) {
        //TODO not found request processing
        return forumService.getById(id).orElse(null);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteById(@PathVariable long id) {
        //TODO true false result??
        forumService.deleteById(id);
    }
    
    //TODO think is id necessary
    @Override
    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public Forum update(@RequestBody Forum one) {
        return forumService.update(one);
    }

    @Override
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public Forum create(@RequestBody Forum one) {
        return forumService.create(one);
    }
}
