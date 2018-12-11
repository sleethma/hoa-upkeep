package com.hoaupkeep.innosol.data.services.map;

import com.hoaupkeep.innosol.data.models.Home;
import com.hoaupkeep.innosol.data.models.House;
import com.hoaupkeep.innosol.data.services.CRUDService;
import com.hoaupkeep.innosol.data.services.HomeService;

import java.util.Set;

public class HomeServiceMap extends AbstractMapService<Home, Long> implements HomeService {
    @Override
    public Set<Home> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Home findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Home save(Home object) {
        return null;
    }

    @Override
    public void delete(Home object) {

    }
}
