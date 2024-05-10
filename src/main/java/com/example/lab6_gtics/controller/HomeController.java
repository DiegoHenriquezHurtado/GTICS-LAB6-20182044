package com.example.lab6_gtics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = {"/paginaInicial"})
    public String paginaInicial(){
        return "index.html";
    }
}
