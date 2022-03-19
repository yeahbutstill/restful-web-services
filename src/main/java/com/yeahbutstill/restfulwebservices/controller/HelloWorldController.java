package com.yeahbutstill.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller
@RestController
public class HelloWorldController {

    // GET
    // URI - /hello-world
    // method - "Hello World"
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

}
