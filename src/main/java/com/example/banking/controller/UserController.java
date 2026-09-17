package com.example.banking.controller;

import com.example.banking.model.User;
import com.example.banking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userservice;

    @GetMapping
    public List<User> getAllUser() {
        return userservice.getAllUser();
    }

    @PostMapping("/save")
    public void addUser(@RequestBody User user) {
        userservice.addUser(user);
    }

    @PutMapping("/update/{userid}")
    public void replaceUser(@PathVariable int userid, @RequestBody User user) {
        userservice.replaceUser(userid, user);
    }

    @DeleteMapping("/delete/{userid}")
    public void removeUser(@PathVariable int userid) {
        userservice.removeUser(userid);
    }
}