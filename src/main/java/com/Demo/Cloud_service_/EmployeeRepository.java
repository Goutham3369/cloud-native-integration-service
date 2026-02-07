package com.Demo.Cloud_service_;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Extending 'JpaRepository' gives us a List<Employee>, fixing the "incompatible types" error.
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}