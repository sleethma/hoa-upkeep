package com.hoaupkeep.innosol.data.services;

import com.hoaupkeep.innosol.data.models.House;

import java.util.Set;

public interface HomeService {

    House findById(Long id);

    House save(House house);

    Set<House> findAll();
}
