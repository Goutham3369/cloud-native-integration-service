package com.Demo.Cloud_service_;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String role;

    // 1. Default Constructor (Required by JPA)
    public Employee() {}

    // 2. Constructor for easier creation
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // 3. GETTERS AND SETTERS (These fix the "cannot find symbol" error)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; } // <--- This fixes the error!

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; } // <--- This fixes the error!
}