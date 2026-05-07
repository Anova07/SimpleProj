package com.projects.minisota.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        System.out.println("Greetings!");
        return "Welcome to Minisota";
    }

    @RequestMapping("/about")
    public String about(){
        return "We provide quality";
    }
}
