package com.hoaupkeep.innosol.repos;

import com.hoaupkeep.innosol.models.Owner;
import com.hoaupkeep.innosol.models.RepairRequest;
import org.springframework.data.repository.CrudRepository;

public interface RepairRequestRepo extends CrudRepository<RepairRequest, Long> {
}
