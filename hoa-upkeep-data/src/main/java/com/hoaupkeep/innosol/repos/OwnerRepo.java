package com.hoaupkeep.innosol.repos;

import com.hoaupkeep.innosol.models.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface OwnerRepo extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
