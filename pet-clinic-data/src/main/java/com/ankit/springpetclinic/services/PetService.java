package com.ankit.springpetclinic.services;

import com.ankit.springpetclinic.model.Pet;

import java.util.Set;

/**
 * created by Ankit on 16 of Apr, 2022
 */
public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
