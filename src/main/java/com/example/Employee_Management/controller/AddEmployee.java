package com.example.Employee_Management.controller;

import com.example.Employee_Management.models.Employee;
import com.example.Employee_Management.repository.EmployeeRepository;
import com.example.Employee_Management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class AddEmployee {
 EmployeeRepository employeeRepository;
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("test")

    public String testApi(){
        return "Test pass with validation chek on eve";
    }

    @PostMapping("add")
@PreAuthorize("hasRole('OWNER') OR hasRole('ADMIN')")
    public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee employee){

        Employee saveEmployee=employeeService.addEmployee(employee);
        return new ResponseEntity<Employee>(saveEmployee, HttpStatus.CREATED);
    }

}

