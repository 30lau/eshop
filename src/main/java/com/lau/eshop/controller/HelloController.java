package com.lau.eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String hello(){
        System.out.println("nihao");
        return "index";
    }
}
