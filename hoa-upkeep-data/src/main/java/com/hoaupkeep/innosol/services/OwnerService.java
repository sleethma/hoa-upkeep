package com.hoaupkeep.innosol.services;

import com.hoaupkeep.innosol.models.Owner;

public interface OwnerService extends CRUDService<Owner, Long> {
    Owner findByLastName(String lastName);
}
