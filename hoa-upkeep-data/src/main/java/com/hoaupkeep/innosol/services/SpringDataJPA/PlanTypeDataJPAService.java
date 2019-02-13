package com.hoaupkeep.innosol.services.SpringDataJPA;

import com.hoaupkeep.innosol.models.Owner;
import com.hoaupkeep.innosol.models.PlanType;
import com.hoaupkeep.innosol.repos.OwnerRepo;
import com.hoaupkeep.innosol.repos.PlanTypeRepo;
import com.hoaupkeep.innosol.services.OwnerService;
import com.hoaupkeep.innosol.services.PlanTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJPA")
public class PlanTypeDataJPAService implements PlanTypeService {

    private final PlanTypeRepo planTypeRepo;

    public PlanTypeDataJPAService(PlanTypeRepo planTypeRepo) {
        this.planTypeRepo = planTypeRepo;
    }

    @Override
    public Set<PlanType> findAll() {
        Set<PlanType> planTypes = new HashSet<>();
        planTypeRepo.findAll().forEach(planTypes :: add);
        return planTypes;
    }

    @Override
    public PlanType findById(Long id) {
        return planTypeRepo.findById(id).orElse(null);
    }

    @Override
    public PlanType save(PlanType object) {
        return planTypeRepo.save(object);
    }

    @Override
    public void delete(PlanType object) {
    planTypeRepo.delete(object);
    }

    @Override
    public void deleteById(Long id) {
    planTypeRepo.deleteById(id);
    }
}
