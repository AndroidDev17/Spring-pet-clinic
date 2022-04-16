package com.ankit.springpetclinic.services;

import com.ankit.springpetclinic.model.Owner;

import java.util.Set;

/**
 * created by Ankit on 16 of Apr, 2022
 */
public interface CrudService<T, ID> {
    T findById(ID id);

    T save(T data);

    Set<T> findAll();

    void delete(T data);

    void deleteById(ID id);
}
