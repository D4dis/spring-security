package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/register")
    public String createUserPage() {
        return "register";
    }

    @GetMapping("/add-article")
    public String addArticle() {
        return "add-article";
    }
}
