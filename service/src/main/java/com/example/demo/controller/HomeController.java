package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @Value("${helloMessage}")
    private String helloMessage;

    @GetMapping
    public ResponseEntity<String> home() {
        return ResponseEntity.ok(helloMessage);
    }

}
