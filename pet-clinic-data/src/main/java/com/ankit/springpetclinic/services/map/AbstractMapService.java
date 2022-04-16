package com.ankit.springpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * created by Ankit on 16 of Apr, 2022
 */
public abstract class AbstractMapService <T,ID>{

    protected Map<ID,T> map = new HashMap();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(ID id, T data) {
        return map.put(id,data);
    }

    void delete(T data) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(data));
    }

    void deleteById(ID id) {
        map.remove(id);
    }
}
