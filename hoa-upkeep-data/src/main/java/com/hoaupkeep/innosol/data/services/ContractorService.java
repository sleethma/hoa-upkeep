package com.hoaupkeep.innosol.data.services;

import com.hoaupkeep.innosol.data.models.Contractor;

import java.util.Set;

public interface ContractorService extends CRUDService<Contractor, Long> {

    Contractor findByLastName(String lastName);
}
