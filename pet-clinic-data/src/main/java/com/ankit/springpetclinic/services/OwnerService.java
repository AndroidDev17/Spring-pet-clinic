package com.ankit.springpetclinic.services;

import com.ankit.springpetclinic.model.Owner;

import java.util.List;
import java.util.Set;

/**
 * created by Ankit on 16 of Apr, 2022
 */
public interface OwnerService {

    List<Owner> findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
