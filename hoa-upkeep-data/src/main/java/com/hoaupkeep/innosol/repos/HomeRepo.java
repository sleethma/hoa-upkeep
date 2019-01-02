package com.hoaupkeep.innosol.repos;

import com.hoaupkeep.innosol.models.Home;
import com.hoaupkeep.innosol.models.Owner;
import org.springframework.data.repository.CrudRepository;

public interface HomeRepo extends CrudRepository<Home, Long> {
}
