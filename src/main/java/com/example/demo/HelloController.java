package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello-public")
    public String helloPublic(){
        return "hello-public";
    }

    @GetMapping("/hello-private")
    public String helloPrivate(){
        return "hello-private";
    }
}
