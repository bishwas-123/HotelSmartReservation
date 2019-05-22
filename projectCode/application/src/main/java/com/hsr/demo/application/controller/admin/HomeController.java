package com.hsr.demo.application.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value={"/","admin"},
            method= RequestMethod.GET)
    public String homepage() {
        return "admin/index";
    }
}
