package com.orexe.loginservice.infrastructure.controllers;

import com.orexe.loginservice.domain.model.User;
import com.orexe.loginservice.application.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<User> register (@RequestBody User user){
        User userCreated = authService.register(user.getUsername(), user.getPassword());
        return ResponseEntity.ok(userCreated);
    }

    /*@PostMapping("/login")
    public ResponseEntity<User> login (@RequestBody User user){
        User userLogger = authService.login(user.getUsername(), user.getPassword());
        return ResponseEntity.ok(userLogger);
    }*/
}
