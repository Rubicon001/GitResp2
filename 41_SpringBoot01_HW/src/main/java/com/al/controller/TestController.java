package com.al.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${al}")
    String al;

    @Value("${level}")
    int level;

    @GetMapping("/test")
    public String test() {
        return "hello springboot_" + al + level;
    }
}
