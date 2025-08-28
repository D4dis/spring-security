package com.example.demo.services;

import com.example.demo.models.UserApp;
import com.example.demo.repositories.UserAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService {
    @Autowired
    UserAppRepository repo;

    public void createUser(String username, String password) {
        repo.save(
                new UserApp(username, password)
        );
    }
}
