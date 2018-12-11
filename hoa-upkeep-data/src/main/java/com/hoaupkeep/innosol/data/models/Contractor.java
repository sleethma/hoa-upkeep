package com.hoaupkeep.innosol.data.models;

import com.hoaupkeep.innosol.data.services.ContractorService;

import java.util.Set;

public class Contractor extends Person implements ContractorService {

    @Override
    public Home findByLastName(String lastName) {
        return null;
    }

    @Override
    public Set<Contractor> findAll() {
        return null;
    }

    @Override
    public Contractor findById(Long aLong) {
        return null;
    }

    @Override
    public Contractor save(Contractor object) {
        return null;
    }

    @Override
    public void delete(Contractor object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
