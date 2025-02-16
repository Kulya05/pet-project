package com.example.petproject.controller;

import com.example.petproject.entity.User;
import com.example.petproject.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin/users")
public class AdminUserController {

    private final UserService userService;

    // Явний конструктор без Lombok
    public AdminUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{username}")
    public Optional<User> getUser(@PathVariable String username) {
        return userService.findByUsername(username);
    }

}
