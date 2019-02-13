package com.hoaupkeep.innosol.services;

import com.hoaupkeep.innosol.models.Owner;

import java.util.List;

public interface OwnerService extends CRUDService<Owner, Long> {
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
