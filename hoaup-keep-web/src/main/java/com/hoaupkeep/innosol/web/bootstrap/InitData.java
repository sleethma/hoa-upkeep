package com.hoaupkeep.innosol.web.bootstrap;

import com.hoaupkeep.innosol.data.models.Contractor;
import com.hoaupkeep.innosol.data.models.Owner;
import com.hoaupkeep.innosol.data.services.ContractorService;
import com.hoaupkeep.innosol.data.services.OwnerService;
import com.hoaupkeep.innosol.data.services.map.ContractorServiceMap;
import com.hoaupkeep.innosol.data.services.map.OwnerServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//initializes data
@Component
public class InitData implements CommandLineRunner {

    private OwnerService ownerService;
    private ContractorService contractorService;

    public InitData() {
        this.ownerService = new OwnerServiceMap();
        this.contractorService = new ContractorServiceMap();
    }

    //will be called immediately after start-up
    @Override
    public void run(String... args) throws Exception {
        Owner testOwner1 = new Owner();
        testOwner1.setFirstName("FirstName1");
        testOwner1.setLastName("LastName1");
        testOwner1.setId(1L);
        ownerService.save(testOwner1);

        Owner dummyOwner2 = new Owner();
        testOwner1.setFirstName("FirstName2");
        testOwner1.setLastName("LastName2");
        testOwner1.setId(2L);
        ownerService.save(dummyOwner2);

        System.out.println("Loaded Owners");

        Contractor dummyContractor1 = new Contractor();
        dummyContractor1.setId(1L);
        dummyContractor1.setFirstName("Contractor1Name");
        dummyContractor1.setLastName("Contractor2Name");
        dummyContractor1.save(dummyContractor1);

        Contractor dummyContractor2 = new Contractor();
        dummyContractor2.setId(1L);
        dummyContractor2.setFirstName("Contractor1Name");
        dummyContractor2.setLastName("Contractor2Name");
        dummyContractor2.save(dummyContractor1);

        System.out.println("Contractors Loaded");
    }
}
