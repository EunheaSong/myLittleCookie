package com.mylittlecookie123.mylittlecookie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String main (){
        return "main";
    }

}