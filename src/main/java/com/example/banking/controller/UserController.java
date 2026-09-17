package com.example.banking.controller;
import com.example.banking.model.User;
import com.example.banking.service.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
@RestController 
public class UserController {
    private UserService userService = new UserService();

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();

    }
    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }
    @PutMapping("/users/{userid}")
    public void replaceUser(@PathVariable int userid, @RequestBody User newUser) {
        userService.replaceUser(userid, newUser);
    }
    @DeleteMapping ("/users/{userid}")
    public void removeUser(@PathVariable int userid) {
        userService.removeUser(userid);
    }
}
