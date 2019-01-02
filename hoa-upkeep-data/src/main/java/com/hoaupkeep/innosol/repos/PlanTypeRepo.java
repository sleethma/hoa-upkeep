package com.hoaupkeep.innosol.repos;

import com.hoaupkeep.innosol.models.PlanType;
import com.hoaupkeep.innosol.models.RepairRequest;
import org.springframework.data.repository.CrudRepository;

public interface PlanTypeRepo extends CrudRepository<PlanType, Long> {
}
