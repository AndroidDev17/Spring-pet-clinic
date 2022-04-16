package com.ankit.springpetclinic.services;

import com.ankit.springpetclinic.model.Owner;

import java.util.List;

/**
 * created by Ankit on 16 of Apr, 2022
 */
public interface OwnerService extends CrudService<Owner, Long> {

    List<Owner> findByLastName(String lastName);
}
