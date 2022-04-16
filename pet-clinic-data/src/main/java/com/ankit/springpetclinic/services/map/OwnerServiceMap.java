package com.ankit.springpetclinic.services.map;

import com.ankit.springpetclinic.model.Owner;
import com.ankit.springpetclinic.services.OwnerService;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * created by Ankit on 16 of Apr, 2022
 */
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner data) {
        return super.save(data.getId(),data);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner data) {
        super.delete(data);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public List<Owner> findByLastName(String lastName) {
        return map.values().stream().filter(owner -> owner.getLastName().equalsIgnoreCase(lastName)).collect(Collectors.toList());
    }
}
