package com.hsr.demo.application.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageController {
    @RequestMapping(value={"/enduser","/user","user","customer"},
            method= RequestMethod.GET)
    public String homepage() {
        return "customer/index";
    }

}
