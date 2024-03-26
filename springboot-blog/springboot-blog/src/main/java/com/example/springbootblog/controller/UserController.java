package com.example.springbootblog.controller;
import com.example.springbootblog.services.UserService;
import org.springframework.stereotype.Service;
import com.example.springbootblog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/home")
    public String home() {
        return "Welcome to Home Page";
    }

    @GetMapping("/user")
    public List<User> getUsers(){
        return this.userService.getUsers();
    }

    @GetMapping("/users/{userId}")
    public User getUserById (@PathVariable long userId)
    {
        return this.userService.getUserById(userId);
    }

    @PutMapping("/users/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable long userId, @RequestBody User userDetails) {
        User updatedUser = userService.updateUser(userId, userDetails);
        if (updatedUser != null) {
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/users/{userId}")
    public boolean deleteUser (@PathVariable long userId)
    {
        return this.userService.deleteUser(userId);
    }

    @PostMapping("users/add")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/users/deleteAll")
    public void deleteAllUsers() {
        userService.deleteAllUsers();
    }

}