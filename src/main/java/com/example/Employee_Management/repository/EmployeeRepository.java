package com.example.Employee_Management.repository;

import com.example.Employee_Management.models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, String > {
    public  Boolean existsByEmail(String email);
}

