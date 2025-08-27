package com.example.demo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @GetMapping("/showuser")
    @ResponseBody
    public String showUser(Authentication authentication) {
        return "User connected : " + authentication.getName();
    }
}
