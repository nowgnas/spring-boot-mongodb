package com.example.mongodb.user.controller;

import com.example.mongodb.user.model.User;
import com.example.mongodb.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserService userService;

    @PostMapping("join")
    public User insertUser(@RequestBody User user) {
        userService.createUser(user);
        return user;
    }
}
