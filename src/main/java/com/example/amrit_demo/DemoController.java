package com.example.amrit_demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DemoController {

    @GetMapping("/test")
    public String getTest() {
        return "Hello world!";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(name = "name", defaultValue = "world") String name) {
        return "Hello, " + name + "!";
    }

}