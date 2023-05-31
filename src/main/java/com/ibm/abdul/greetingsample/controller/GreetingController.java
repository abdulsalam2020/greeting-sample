package com.ibm.abdul.greetingsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @GetMapping
    public String greet(){
        return "Hello. Welcome to greeting service.....!!";
    }
}
