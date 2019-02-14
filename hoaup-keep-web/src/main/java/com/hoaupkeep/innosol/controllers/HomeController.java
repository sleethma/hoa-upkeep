package com.hoaupkeep.innosol.controllers;

import com.hoaupkeep.innosol.models.Owner;
import com.hoaupkeep.innosol.models.PlanType;
import com.hoaupkeep.innosol.services.HomesService;
import com.hoaupkeep.innosol.services.OwnerService;
import com.hoaupkeep.innosol.services.PlanTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@RequestMapping("/owners/{ownerId}")
@Controller
public class HomeController {


    private final HomesService homesService;
    private final OwnerService ownerService;
    private final PlanTypeService planTypeService;

    private static final String VIEWS_PETS_CREATE_OR_UPDATE_FORM = "pets/createOrUpdatePetForm";


    public HomeController(HomesService homesService, OwnerService ownerService, PlanTypeService planTypeService) {
        this.homesService = homesService;
        this.ownerService = ownerService;
        this.planTypeService = planTypeService;
    }

    @ModelAttribute("types")
    public Collection<PlanType> populatePetTypes() {
        return planTypeService.findAll()git;
    }

    @ModelAttribute("owner")
    public Owner findOwner(@PathVariable("ownerId") Long ownerId) {
        return ownerService.findById(ownerId);
    }

    @InitBinder("owner")
    public void initOwnerBinder(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }
}
