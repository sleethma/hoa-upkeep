package com.hoaupkeep.innosol.data.services.map;

import com.hoaupkeep.innosol.data.models.Contractor;
import com.hoaupkeep.innosol.data.models.Home;
import com.hoaupkeep.innosol.data.services.ContractorService;

import java.util.Set;

public class ContractorServiceMap extends AbstractMapService<Contractor, Long> implements ContractorService{
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
        return super.save(object.getId(), object);
    }


    @Override
    public Home findByLastName(String lastName) {
        return null;
    }
}
