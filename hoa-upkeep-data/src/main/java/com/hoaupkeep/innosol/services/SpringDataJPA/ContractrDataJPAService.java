package com.hoaupkeep.innosol.services.SpringDataJPA;

import com.hoaupkeep.innosol.models.Contractor;
import com.hoaupkeep.innosol.models.Home;
import com.hoaupkeep.innosol.repos.ContractorRepo;
import com.hoaupkeep.innosol.services.ContractorService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("SpringDataJPA")
public class ContractrDataJPAService implements ContractorService {

    private final ContractorRepo contractorRepo;

    public ContractrDataJPAService(ContractorRepo contractorRepo) {
        this.contractorRepo = contractorRepo;
    }


    @Override
    public Contractor findByLastName(String lastName) {
        return contractorRepo.findByLastName(lastName);
    }

    @Override
    public Set<Contractor> findAll() {
        Set<Contractor> contractorSet = new HashSet<>();
        contractorRepo.findAll().forEach(contractorSet::add);
        return contractorSet;
    }

    @Override
    public Contractor findById(Long id) {
        return contractorRepo.findById(id).orElse(null);
    }

    @Override
    public Contractor save(Contractor object) {
        return contractorRepo.save(object);
    }

    @Override
    public void delete(Contractor object) {
    contractorRepo.delete(object);
    }

    @Override
    public void deleteById(Long id) {
    contractorRepo.deleteById(id);
    }
}
