package com.capgemini.GreetingApp.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    //    UC2 code files
    public String getGreetingMessage() {
        return "Hello World";
    }
}