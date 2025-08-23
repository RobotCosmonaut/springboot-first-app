package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String HelloWorld(){
        return "Hello World";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to CS 7319!";
    }

}
