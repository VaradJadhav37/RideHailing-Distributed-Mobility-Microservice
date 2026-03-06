package com.example.UserService.controller;

import com.example.UserService.models.UserModel;
import com.example.UserService.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserRepo userRepo;

    @PostMapping("/register")
    public UserModel register(@RequestBody UserModel user){
        return userRepo.save(user);
    }
    @PostMapping("/login")
    public UserModel login(@RequestBody UserModel user){
        return userRepo.findById(user.getId()).orElseThrow();
    }

    @GetMapping("/{id}")
    public UserModel getUser(@PathVariable Long id){
        return userRepo.findById(id).orElseThrow();
    }
}