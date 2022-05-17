package com.al.controller;

import com.al.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    Person person;

    @GetMapping("/test")
    public String test() {
        return "hello springboot_" + person;
    }
}
