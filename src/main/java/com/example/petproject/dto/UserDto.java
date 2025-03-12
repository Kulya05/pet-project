package com.example.petproject.dto;

import jakarta.validation.constraints.NotBlank;

public class UserDto {

    @NotBlank(message = "Username cannot be empty")
    private String username;

    @NotBlank(message = "Password cannot be empty")
    private String password;

    // Конструктор без параметрів
    public UserDto() {}

    // Конструктор з параметрами
    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Гетери
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Сетери
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
