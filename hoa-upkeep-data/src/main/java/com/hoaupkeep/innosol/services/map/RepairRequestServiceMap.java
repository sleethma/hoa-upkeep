package com.hoaupkeep.innosol.services.map;

import com.hoaupkeep.innosol.models.Home;
import com.hoaupkeep.innosol.models.RepairRequest;
import com.hoaupkeep.innosol.services.HomesService;
import com.hoaupkeep.innosol.services.RepairRequestService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RepairRequestServiceMap extends AbstractMapService<RepairRequest, Long> implements RepairRequestService {
    @Override
    public Set<RepairRequest> findAll() {
        return super.findAll();
    }

    @Override
    public RepairRequest findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public RepairRequest save(RepairRequest repairRequest) {
        if(repairRequest.getHome() == null || repairRequest.getHome().getId() == null ||
        repairRequest.getHome().getOwner() == null || repairRequest.getHome().getOwner().getId() == null)
            throw new RuntimeException("Invalid repair request");

        return super.save(repairRequest);
    }

    @Override
    public void delete(RepairRequest object) {
    super.deleteByObject(object);
    }
}
