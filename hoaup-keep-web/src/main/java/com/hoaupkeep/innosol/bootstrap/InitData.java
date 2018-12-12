package com.hoaupkeep.innosol.bootstrap;

import com.hoaupkeep.innosol.models.Contractor;
import com.hoaupkeep.innosol.models.Owner;
import com.hoaupkeep.innosol.services.ContractorService;
import com.hoaupkeep.innosol.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//initializes data
@Component
public class InitData implements CommandLineRunner {

    private OwnerService ownerService;
    private ContractorService contractorService;

    public InitData(OwnerService ownerService, ContractorService contractorService) {
        this.ownerService = ownerService;
        this.contractorService = contractorService;
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
        dummyOwner2.setFirstName("FirstName2");
        dummyOwner2.setLastName("LastName2");
        dummyOwner2.setId(2L);
        ownerService.save(dummyOwner2);

        Owner dummyOwner3 = new Owner();
        dummyOwner3.setFirstName("FirstName3");
        dummyOwner3.setLastName("LastName3");
        dummyOwner3.setId(3L);
        ownerService.save(dummyOwner3);

        System.out.println("Loaded Owners");

        Contractor dummyContractor1 = new Contractor();
        dummyContractor1.setId(1L);
        dummyContractor1.setFirstName("Contractor1FirstName");
        dummyContractor1.setLastName("Contractor1LastName");
        contractorService.save(dummyContractor1);

        Contractor dummyContractor2 = new Contractor();
        dummyContractor2.setId(2L);
        dummyContractor2.setFirstName("Contractor2FirstName");
        dummyContractor2.setLastName("Contractor2LastName");
        contractorService.save(dummyContractor2);

        System.out.println("Contractors Loaded");
    }
}
