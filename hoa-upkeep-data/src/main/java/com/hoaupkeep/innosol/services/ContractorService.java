package com.hoaupkeep.innosol.services;

import com.hoaupkeep.innosol.models.Contractor;
import com.hoaupkeep.innosol.models.Home;

public interface ContractorService extends CRUDService<Contractor, Long> {

    Contractor findByLastName(String lastName);
}
