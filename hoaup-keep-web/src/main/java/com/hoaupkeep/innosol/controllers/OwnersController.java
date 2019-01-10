package com.hoaupkeep.innosol.controllers;

import com.hoaupkeep.innosol.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
