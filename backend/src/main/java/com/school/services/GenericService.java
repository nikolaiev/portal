package com.school.services;

import java.util.Optional;

public interface GenericService<T> {

    Optional<T> getById(long id);
    Iterable<T> getAllPageOffsetSize(int pageOffset, int pageSize);
    T create(T one);

    //idempotent methods
    T update(T one);
    void deleteById(long id);
}
