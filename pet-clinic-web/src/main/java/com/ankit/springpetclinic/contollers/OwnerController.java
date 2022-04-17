package com.ankit.springpetclinic.contollers;

import com.ankit.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by Ankit on 16 of Apr, 2022
 */

@Controller
@RequestMapping("owners")
public class OwnerController {

    private final OwnerService service;

    public OwnerController(OwnerService service) {
        this.service = service;
    }

    @RequestMapping({"","/","/index","index.html"})
    public String getAllOwners(Model model) {
        model.addAttribute("owners",service.findAll());
        return "owners/index";
    }
}
