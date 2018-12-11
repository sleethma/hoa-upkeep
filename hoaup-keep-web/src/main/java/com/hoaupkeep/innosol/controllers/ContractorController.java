package com.hoaupkeep.innosol.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContractorController {

    @GetMapping({"contractors/index", "contractors/index.html", "contractors"})
    public String getListView(){
        return "contractors/index";
    }
}
