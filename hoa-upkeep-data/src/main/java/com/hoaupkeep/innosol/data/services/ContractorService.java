package com.hoaupkeep.innosol.data.services;

import java.util.Set;

public interface ContractorService {

    Contractor findByLastName(String lastName);

    Contractor findById(Long id);

    Contractor save(Contractor owner);

    Set<Contractor> findAll();
}
