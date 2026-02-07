package com.Demo.Cloud_service_;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // UPDATED: Now accepts EmployeeDTO and checks for @Valid
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody EmployeeDTO employeeDTO) {

        // Transfer data from DTO to the real Database Entity
        Employee emp = new Employee();
        emp.setName(employeeDTO.getName());
        emp.setRole(employeeDTO.getRole());

        // Save to database
        Employee savedEmployee = repository.save(emp);

        return ResponseEntity.ok(savedEmployee);
    }
}