package com.hoaupkeep.innosol.controllers;

import com.hoaupkeep.innosol.services.ContractorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContractorController {

    private final ContractorService contractorService;

    public ContractorController(ContractorService contractorService) {
        this.contractorService = contractorService;
    }

    @GetMapping({"contractors/index", "contractors/index.html", "contractors"})
    public String getListView(Model model){
        model.addAttribute("contractors", contractorService.findAll());
        return "contractors/index";
    }
}
