package com.school.controllers;

import com.school.entities.User;
import com.school.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController implements RestApiController<User> {
    @Autowired
    UserService userService;

    @Override
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Iterable<User> getLimitOffset(@RequestParam(value = "page_numb",defaultValue = "0") int pageOffset, @RequestParam(value = "page_size",defaultValue = "20") int pageSize) {
        return userService.getAllPageOffsetSize(pageOffset, pageSize);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getById(@PathVariable  long id) {
        //TODO not found request processing
        return userService.getById(id).orElse(null);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteById(@PathVariable long id) {
        //TODO true false result??
        userService.deleteById(id);
    }

    //TODO think is id necessary
    @Override
    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public User update(@RequestBody User one) {
        return userService.update(one);
    }

    @Override
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public User create(@RequestBody User one) {
        return userService.create(one);
    }
}
