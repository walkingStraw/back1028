package com.louis.mango.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping(value = "/sayHello")
    public String sayHello(){
        return "hello!";
    }
}
