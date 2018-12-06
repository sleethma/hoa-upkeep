package com.hoaupkeep.innosol.data.services.map;

import com.hoaupkeep.innosol.data.models.Home;
import com.hoaupkeep.innosol.data.services.CRUDService;

import java.util.Set;

public class HomeServiceMap extends AbstractMapService<Home, Long> implements CRUDService<Home, Long> {
    @Override
    public Set<Home> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }

    @Override
    public void delete(Home object) {
    super.deleteByObject(object);
    }

    @Override
    public Home findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Home save(Home object) {
        return super.save(object.getId(), object);
    }


}
