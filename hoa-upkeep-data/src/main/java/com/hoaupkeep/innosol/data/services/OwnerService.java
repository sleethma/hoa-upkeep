package com.hoaupkeep.innosol.data.services;

import com.hoaupkeep.innosol.data.models.Owner;

import java.util.Set;

public interface OwnerService extends CRUDService<Owner, Long> {

    Owner findByLastName(String lastName);
}
