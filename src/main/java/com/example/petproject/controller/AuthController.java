package com.example.petproject.controller;

import com.example.petproject.entity.User;
import com.example.petproject.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        if (userService.findByUsername(user.getUsername()).isPresent()) {
            return ResponseEntity.badRequest().body("❌ User already exists!");
        }

        User newUser = userService.registerUser(user);
        return ResponseEntity.ok("✅ User '" + newUser.getUsername() + "' registered successfully!");
    }
}
