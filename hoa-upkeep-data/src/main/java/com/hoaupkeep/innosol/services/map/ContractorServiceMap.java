package com.hoaupkeep.innosol.services.map;

import com.hoaupkeep.innosol.models.Contractor;
import com.hoaupkeep.innosol.models.Home;
import com.hoaupkeep.innosol.services.ContractorService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ContractorServiceMap extends AbstractMapService<Contractor, Long> implements ContractorService {
    @Override
    public Set<Contractor> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }

    @Override
    public void delete(Contractor object) {
    super.deleteByObject(object);
    }

    @Override
    public Contractor findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Contractor save(Contractor object) {
        return super.save( object);
    }


    @Override
    public Home findByLastName(String lastName) {
        return null;
    }
}
