package com.capgemini.GreetingApp.Controller;

import com.capgemini.GreetingApp.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    //    UC1 codeefiles
    @GetMapping
    public String getGreeting() {
        return "{\"message\": \"Hello World\"}";
    }

    @PostMapping
    public String postGreeting() {
        return "{\"message\": \"Greeting received!\"}";
    }

    @PutMapping
    public String putGreeting() {
        return "{\"message\": \"Greeting updated!\"}";
    }

    @DeleteMapping
    public String deleteGreeting() {
        return "{\"message\": \"Greeting deleted!\"}";
    }

    @Autowired
    private GreetingService greetingService;


    @GetMapping
    public String getGreeting2() {
        return "{\"message\": \"" + greetingService.getGreetingMessage() + "\"}";
    }

}
