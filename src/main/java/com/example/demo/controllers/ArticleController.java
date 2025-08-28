package com.example.demo.controllers;

import com.example.demo.models.Article;
import com.example.demo.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleRepository articleRepository;

    @PostMapping("/new")
    public String registerUser(@ModelAttribute Article article) throws Exception {
        articleRepository.save(new Article(article.getTitre(), article.getContenu()));
        return "article créé";
    }
}
