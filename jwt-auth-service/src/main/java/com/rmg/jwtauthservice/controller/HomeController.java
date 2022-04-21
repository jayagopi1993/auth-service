package com.rmg.jwtauthservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/welcome")
    public ResponseEntity<String> welcomeMessage() {
        return ResponseEntity.ok("Welcome!!");
    }
}
