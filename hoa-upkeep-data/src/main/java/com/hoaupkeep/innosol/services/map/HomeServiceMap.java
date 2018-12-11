package com.hoaupkeep.innosol.services.map;

import com.hoaupkeep.innosol.models.Home;
import com.hoaupkeep.innosol.services.HomeService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
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
