package com.hoaupkeep.innosol.services.SpringDataJPA;

import com.hoaupkeep.innosol.models.ContractorSpecialty;
import com.hoaupkeep.innosol.models.Home;
import com.hoaupkeep.innosol.repos.ContractorSpecialtyRepo;
import com.hoaupkeep.innosol.repos.HomeRepo;
import com.hoaupkeep.innosol.services.HomesService;
import com.hoaupkeep.innosol.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile({"SpringDataJPA", "H2SpringDataJPA"})
public class SpecialtyJPAService implements SpecialtyService {

    ContractorSpecialtyRepo specialtyRepo;

    public SpecialtyJPAService(ContractorSpecialtyRepo specialtyRepo) {
        this.specialtyRepo = specialtyRepo;
    }

    @Override
    public Set<ContractorSpecialty> findAll() {
        Set<ContractorSpecialty> specialtySet = new HashSet<>();
        specialtyRepo.findAll().forEach(specialtySet :: add);
        return specialtySet;
    }

    @Override
    public ContractorSpecialty findById(Long id) {
        return specialtyRepo.findById(id).orElse(null);
    }

    @Override
    public ContractorSpecialty save(ContractorSpecialty object) {
        return specialtyRepo.save(object);
    }

    @Override
    public void delete(ContractorSpecialty object) {
    specialtyRepo.delete(object);
    }

    @Override
    public void deleteById(Long id) {
    specialtyRepo.deleteById(id);
    }
}
