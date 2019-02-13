package com.hoaupkeep.innosol.controllers;

import com.hoaupkeep.innosol.models.Owner;
import com.hoaupkeep.innosol.services.OwnerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class OwnersController {

    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"/owners", "owners/index", "owners/index.html"})
    public String ownersList(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

    @GetMapping("owners/find")
    public String ownersTempLinkFix(){
        return "error-page";
    }

    @GetMapping("/owners/{ownerId}")
    public String showOwner(@PathVariable("ownerId") Long ownerId, Model model) {
        model.addAttribute("owner", ownerService.findById(ownerId));
        System.out.println("#############################"  + ownerService.findById(1L).getCity());
        return "owners/ownerDetails";
    }
}
