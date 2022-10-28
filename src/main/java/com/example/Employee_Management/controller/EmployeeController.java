package com.example.Employee_Management.controller;

import com.example.Employee_Management.models.Employee;
import com.example.Employee_Management.repository.EmployeeRepository;
import com.example.Employee_Management.service.EmployeeService;
import com.example.Employee_Management.utils.PasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    private EmployeeService employeeService;

    @Value("${password.length}")
    private int passwordLength;


    @PostMapping("/employees")
    @PreAuthorize("hasRole('OWNER') OR hasRole('ADMIN')")
    public ResponseEntity<Employee> addEmployee(@Valid @RequestPart ("body") Employee employee,  @RequestPart("nicImage") MultipartFile nicImage) throws IOException {
////        employee.setStatus("New");
//
//        employee.setPassword(String.valueOf(PasswordUtils.passwordGenerator(passwordLength)));
//        if (employeeRepository.existsByEmail(employee.getEmail())) {
//            return new ResponseEntity<Employee>( HttpStatus.BAD_REQUEST);
//        }
//
//
//        Employee saveEmployee = employeeService.addEmployee(employee,nicImage);
//        return new ResponseEntity<Employee>(saveEmployee, HttpStatus.CREATED);
        System.out.println(nicImage.getContentType());
        System.out.println(employee);
//
return null;
    }
}
