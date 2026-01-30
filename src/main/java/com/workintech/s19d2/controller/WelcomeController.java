package com.workintech.s19d2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String home() {
        return "API is running. Use POST /workintech/auth/register (Postman/curl). GET /workintech/accounts requires auth.";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome!";
    }
}
