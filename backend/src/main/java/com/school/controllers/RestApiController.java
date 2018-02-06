package com.school.controllers;

public interface RestApiController<T> {
    Iterable<T> getLimitOffset(int limit,int offset);
    T getById(long id);
    void deleteById(long id);
    T update(T one);
    T create(T one);
}
