package com.ankit.springpetclinic.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by Ankit on 16 of Apr, 2022
 */

@Controller
@RequestMapping("owners")
public class OwnerController {

    @RequestMapping({"","/","/index","index.html"})
    public String getAllOwners() {
        return "owners/index";
    }
}
