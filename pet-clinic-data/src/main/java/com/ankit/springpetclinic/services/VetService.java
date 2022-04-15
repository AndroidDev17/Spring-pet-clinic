package com.ankit.springpetclinic.services;

import com.ankit.springpetclinic.model.Vet;

import java.util.List;
import java.util.Set;

/**
 * created by Ankit on 16 of Apr, 2022
 */
public interface VetService {
    List<Vet> findByLastName(String lastName);

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
