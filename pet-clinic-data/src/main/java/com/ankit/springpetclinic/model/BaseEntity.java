package com.ankit.springpetclinic.model;

import java.io.Serializable;

/**
 * created by Ankit on 16 of Apr, 2022
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
