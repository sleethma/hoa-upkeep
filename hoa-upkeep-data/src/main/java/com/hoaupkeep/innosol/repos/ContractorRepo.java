package com.hoaupkeep.innosol.repos;

import com.hoaupkeep.innosol.models.Contractor;
import com.hoaupkeep.innosol.models.Owner;
import org.springframework.data.repository.CrudRepository;

public interface ContractorRepo extends CrudRepository<Contractor, Long> {
}
