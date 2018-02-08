package com.school.services;

import com.school.entities.Message;
import com.school.entities.News;
import com.school.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NewsService implements GenericService<News> {
    @Autowired
    NewsRepository newsRepository;

    @Override
    public Optional<News> getById(long id) {
        return Optional.ofNullable(newsRepository.findOne(id));
    }

    @Override
    public Iterable<News> getAllPageOffsetSize(int pageOffset, int pageSize) {
        return newsRepository.findAll(new PageRequest(pageOffset,pageSize));
    }

    @Override
    public News create(News one) {
        return newsRepository.save(one);
    }

    @Override
    public News update(News one) {
        return newsRepository.save(one);
    }

    @Override
    public void deleteById(long id) {
        newsRepository.delete(id);
    }
}
