package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BasicController {

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }

    @PostMapping("/name")
    public String echo(@RequestBody String message) {
        return "You said: " + message;
    }

    @DeleteMapping("/clear")
    public ResponseEntity<String> clearMessage() {
        return ResponseEntity.ok("Greeting cleared.");
    }

}
