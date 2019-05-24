package com.hsr.demo.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControl {

    @GetMapping(value = {"", "/","home","hsr","/home","/hsr"})
    public String displayHome(){
        return"homepage/index";
    }
}
