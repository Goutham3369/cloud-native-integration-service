package com.Demo.Cloud_service_;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(EmployeeRepository repository) {
        return args -> {
            // Create a new employee
            Employee emp = new Employee("Goutham", "Cloud Architect");

            // Save to database
            repository.save(emp);

            System.out.println("✅ Employee added to database!");
        };
    }
}