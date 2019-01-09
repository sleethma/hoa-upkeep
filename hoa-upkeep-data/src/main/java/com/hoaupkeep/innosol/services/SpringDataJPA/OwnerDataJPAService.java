package com.hoaupkeep.innosol.services.SpringDataJPA;

import com.hoaupkeep.innosol.models.Owner;
import com.hoaupkeep.innosol.repos.OwnerRepo;
import com.hoaupkeep.innosol.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("SpringDataJPA")
public class OwnerDataJPAService implements OwnerService {

    private final OwnerRepo ownerRepo;

    public OwnerDataJPAService(OwnerRepo ownerRepo) {
        this.ownerRepo = ownerRepo;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepo.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> ownerSet = new HashSet<>();
        ownerRepo.findAll().forEach(ownerSet :: add);
        return ownerSet;
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepo.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepo.save(object);
    }

    @Override
    public void delete(Owner object) {
    ownerRepo.delete(object);
    }

    @Override
    public void deleteById(Long id) {
    ownerRepo.deleteById(id);
    }
}
