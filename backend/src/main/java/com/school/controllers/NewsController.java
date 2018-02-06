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
    public Iterable<News> getLimitOffset(@RequestParam(value = "page_numb",defaultValue = "0") int pageOffset,
                                         @RequestParam(value = "page_size",defaultValue = "20") int pageSize) {
        return newsService.getAllPageOffsetSize(pageOffset,pageSize);
    }

    @Override
    public News getById(long id) {
        //TODO not found request processing
        return newsService.getById(id).orElse(null);
    }

    @Override
    public void deleteById(long id) {
        //TODO true false result??
        newsService.deleteById(id);
    }

    @Override
    public News update(News one) {
        return newsService.update(one);
    }

    @Override
    public News create(News one) {
        return newsService.create(one);
    }
}
