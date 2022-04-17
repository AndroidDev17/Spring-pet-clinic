package com.ankit.springpetclinic.services.map;

import com.ankit.springpetclinic.model.Vet;
import com.ankit.springpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * created by Ankit on 16 of Apr, 2022
 */

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet data) {
        return super.save(data.getId(), data);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet data) {
        super.delete(data);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
