package com.Demo.Cloud_service_;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EmployeeDTO {

    // Rule 1: Name cannot be empty
    @NotBlank(message = "Name cannot be empty")
    private String name;

    // Rule 2: Role must be between 2 and 50 characters
    @NotBlank(message = "Role cannot be empty")
    @Size(min = 2, max = 50, message = "Role must be between 2 and 50 characters")
    private String role;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}