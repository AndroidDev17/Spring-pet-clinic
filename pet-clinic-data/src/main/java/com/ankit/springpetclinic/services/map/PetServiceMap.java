package com.ankit.springpetclinic.services.map;

import com.ankit.springpetclinic.model.Pet;
import com.ankit.springpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * created by Ankit on 16 of Apr, 2022
 */

@Service
public class PetServiceMap extends AbstractMapService <Pet,Long> implements PetService {

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet data) {
        return super.save(data.getId(), data);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet data) {
        super.delete(data);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
