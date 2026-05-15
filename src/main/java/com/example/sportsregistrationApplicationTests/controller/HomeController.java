package com.example.sportsregistrationApplicationTests.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Sports Registration API is LIVE 🚀 Use /api/registrations";
    }
}