package com.hoaupkeep.innosol.data.models;

import com.hoaupkeep.innosol.data.services.OwnerService;

import java.util.Set;

public class Owner extends Person implements OwnerService {
    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

    @Override
    public Owner findById(Long id) {
        return null;
    }

    @Override
    public Owner save(Owner owner) {
        return null;
    }

    @Override
    public void delete(Owner object) {

    }
    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Set<Owner> findAll() {
        return null;
    }
}
