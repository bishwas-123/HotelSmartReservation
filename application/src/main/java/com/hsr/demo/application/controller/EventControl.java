package com.hsr.demo.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventControl {
    @GetMapping(value = "hsr/events")
    public String displayPackages(){
        return "events/home";
    }
}

