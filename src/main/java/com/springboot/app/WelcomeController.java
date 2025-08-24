/*
*   CS 7319 Software Architecture
*   Homework 1B
*   Java Spring Boot and Docker
*   Ron Denny
*   rdenny@smu.edu
*
*   Note: this is based on the instructions noted for Homework 1B with a Maven based project
*   and the use of the WelcomeController
*
*/

package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String HelloWorld(){
        return "Hello World!";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to CS 7319!";
    }

}
