package com.group.training.controllers;

import com.group.training.dto.UserRequest;
import com.group.training.entities.User;
import com.group.training.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("get-all-user")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping("register")
    public String addUser(@RequestBody UserRequest user) {
        return userService.addUser(user);
    }
    @PostMapping("login")
    public ResponseEntity<String> loginUser(@RequestBody UserRequest user) {
        return userService.loginUser(user);
    }
}
