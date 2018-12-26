package com.hoaupkeep.innosol.services.map;

import com.hoaupkeep.innosol.models.Home;
import com.hoaupkeep.innosol.models.Owner;
import com.hoaupkeep.innosol.services.HomeService;
import com.hoaupkeep.innosol.services.OwnerService;
import com.hoaupkeep.innosol.services.PlanTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final HomeService homeService;
    private final PlanTypeService planTypeService;

    public OwnerServiceMap(HomeService homeService, PlanTypeService planTypeService) {
        this.homeService = homeService;
        this.planTypeService = planTypeService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }

    @Override
    public Owner save(Owner object) {
        if (object != null) {
            object.getHomes().forEach(home -> {
                if (home.getPlanType() != null) {
                    home.setPlanType(planTypeService.save(home.getPlanType()));
                } else {
                    throw new RuntimeException("Must have a plan type for home");
                }

                if (home.getId() == null) {
                    Home savedHome = homeService.save(home);
                    home.setId(savedHome.getId());
                }
            });
            return super.save(object);
        }else{
            return null;
        }
    }

    @Override
    public void delete(Owner object) {
    super.deleteByObject(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
