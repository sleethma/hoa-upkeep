package com.hoaupkeep.innosol.data.services;

import com.hoaupkeep.innosol.data.models.Contractor;
import com.hoaupkeep.innosol.data.models.Home;

public interface ContractorService extends CRUDService<Contractor, Long> {

    Home findByLastName(String lastName);
}
