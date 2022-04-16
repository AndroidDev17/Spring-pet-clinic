package com.ankit.springpetclinic.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by Ankit on 16 of Apr, 2022
 */

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "inex.html"})
    public String index() {
        return "index";
    }
}
