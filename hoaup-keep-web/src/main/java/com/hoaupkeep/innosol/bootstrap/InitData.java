package com.hoaupkeep.innosol.bootstrap;

import com.hoaupkeep.innosol.models.Contractor;
import com.hoaupkeep.innosol.models.Home;
import com.hoaupkeep.innosol.models.Owner;
import com.hoaupkeep.innosol.models.PlanType;
import com.hoaupkeep.innosol.services.ContractorService;
import com.hoaupkeep.innosol.services.OwnerService;
import com.hoaupkeep.innosol.services.PlanTypeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDate;


//initializes data
@Component
public class InitData implements CommandLineRunner {

    private OwnerService ownerService;
    private ContractorService contractorService;
    private PlanTypeService planTypeService;

    public InitData(OwnerService ownerService, ContractorService contractorService, PlanTypeService planTypeService) {
        this.ownerService = ownerService;
        this.contractorService = contractorService;
        this.planTypeService = planTypeService;
    }

    //will be called immediately after start-up
    @Override
    public void run(String... args) throws Exception {
        PlanType threeBedroom = new PlanType();
        threeBedroom.setName("threeBedRoom");
        planTypeService.save(threeBedroom);

        PlanType fourBedroom = new PlanType();
        fourBedroom.setName("fourBedroom");
        planTypeService.save(fourBedroom);

        Owner testOwner1 = new Owner();
        testOwner1.setFirstName("FirstName1");
        testOwner1.setLastName("LastName1");
        testOwner1.setAddress("123 Sillyville");
        testOwner1.setCity("St. Louis");
        testOwner1.setTelephone("901-222-7676");
        ownerService.save(testOwner1);

        Home testOwner1Home = new Home();
        testOwner1Home.setOwner(testOwner1);
        testOwner1Home.setPlanType(threeBedroom);
        testOwner1Home.setBuildDate(LocalDate.now());
        testOwner1Home.setPropertyAddress("374 Fountain Crest");
        testOwner1Home.setResidentFirstName("George");
        testOwner1Home.setResidentLastName("Slimter");
        testOwner1.getHomes().add(testOwner1Home);

        Owner dummyOwner2 = new Owner();
        dummyOwner2.setFirstName("FirstName2");
        dummyOwner2.setLastName("LastName2");
        dummyOwner2.setAddress("321 Hanson St.");
        dummyOwner2.setCity("Detroit");
        dummyOwner2.setTelephone("945-666-3444");
        ownerService.save(dummyOwner2);

        Home dummyOwner2Home = new Home();
        dummyOwner2Home.setOwner(dummyOwner2);
        dummyOwner2Home.setPlanType(fourBedroom);
        dummyOwner2Home.setBuildDate(LocalDate.now());
        dummyOwner2Home.setPropertyAddress("764 Rightway Cr.");
        dummyOwner2Home.setResidentFirstName("Rachel");
        dummyOwner2Home.setResidentLastName("Biggs");
        dummyOwner2.getHomes().add(dummyOwner2Home);

        Owner dummyOwner3 = new Owner();
        dummyOwner3.setFirstName("FirstName3");
        dummyOwner3.setLastName("LastName3");
        ownerService.save(dummyOwner3);

        System.out.println("Loaded Owners");

        Contractor dummyContractor1 = new Contractor();
        dummyContractor1.setFirstName("Contractor1FirstName");
        dummyContractor1.setLastName("Contractor1LastName");
        contractorService.save(dummyContractor1);

        Contractor dummyContractor2 = new Contractor();
        dummyContractor2.setFirstName("Contractor2FirstName");
        dummyContractor2.setLastName("Contractor2LastName");
        contractorService.save(dummyContractor2);

        System.out.println("Contractors Loaded");
    }
}
