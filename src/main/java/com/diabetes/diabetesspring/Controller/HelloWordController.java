package com.diabetes.diabetesspring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")

public class HelloWordController {

    @GetMapping
    public String hello(){
        return "Hello";
    }
}
