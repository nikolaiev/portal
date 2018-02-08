package com.school.controllers;

import com.school.entities.News;
import com.school.repositories.NewsRepository;
import com.school.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController implements RestApiController<News>{
    @Autowired
    NewsService newsService;

    @Override
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Iterable<News> getLimitOffset(@RequestParam(value = "page_numb",defaultValue = "0") int pageOffset, @RequestParam(value = "page_size",defaultValue = "20") int pageSize) {
        return newsService.getAllPageOffsetSize(pageOffset, pageSize);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public News getById(@PathVariable  long id) {
        //TODO not found request processing
        return newsService.getById(id).orElse(null);
    }

    @Override
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteById(@PathVariable long id) {
        //TODO true false result??
        newsService.deleteById(id);
    }

    //TODO think is id necessary
    @Override
    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public News update(@RequestBody News one) {
        return newsService.update(one);
    }

    @Override
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public News create(@RequestBody News one) {
        return newsService.create(one);
    }
}
