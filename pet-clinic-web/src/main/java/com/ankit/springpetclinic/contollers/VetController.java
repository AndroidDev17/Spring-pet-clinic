package com.ankit.springpetclinic.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by Ankit on 16 of Apr, 2022
 */
@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String getAllVets(Model model) {

        return "vets/index";
    }
}
