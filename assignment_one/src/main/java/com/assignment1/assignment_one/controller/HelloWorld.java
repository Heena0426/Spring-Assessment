package com.assignment1.assignment_one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public String Display(){
        return  "Hello,World!";
    }
}
