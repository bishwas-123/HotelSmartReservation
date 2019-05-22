package com.hsr.demo.application.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserRegistration {
    @GetMapping(value="/login/")
    public String login(){
        return "user/login";
    }
}
