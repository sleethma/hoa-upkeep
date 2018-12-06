package com.hoaupkeep.innosol.data.services;

import com.hoaupkeep.innosol.data.models.Home;

public interface ContractorService extends CRUDService<Home, Long> {

    Home findByLastName(String lastName);
}
