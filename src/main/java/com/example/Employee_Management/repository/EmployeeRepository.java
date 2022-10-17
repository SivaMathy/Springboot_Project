package com.example.Employee_Management.repository;

import com.example.Employee_Management.models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String > {
}

