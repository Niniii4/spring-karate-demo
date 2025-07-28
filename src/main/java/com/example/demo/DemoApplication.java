package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

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
