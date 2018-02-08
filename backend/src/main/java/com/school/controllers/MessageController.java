package com.school.controllers;

import com.school.entities.Message;
import com.school.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/message")
public class MessageController implements RestApiController<Message> {
    @Autowired
    MessageService messageService;

    @Override
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Iterable<Message> getLimitOffset(@RequestParam(value = "page_numb",defaultValue = "0") int pageOffset, @RequestParam(value = "page_size",defaultValue = "20") int pageSize) {
        return messageService.getAllPageOffsetSize(pageOffset, pageSize);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Message getById(@PathVariable  long id) {
        //TODO not found request processing
        return messageService.getById(id).orElse(null);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteById(@PathVariable long id) {
        //TODO true false result??
        messageService.deleteById(id);
    }

    //TODO think is id necessary
    @Override
    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public Message update(@RequestBody Message one) {
        return messageService.update(one);
    }

    @Override
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public Message create(@RequestBody Message one) {
        return messageService.create(one);
    }
}
