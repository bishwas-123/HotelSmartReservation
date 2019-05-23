package com.hsr.demo.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PackageControl {
    @GetMapping(value = "hsr/packages")
    public String displayPackages(){
        return "packages/home";
    }
}

