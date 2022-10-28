package com.example.Employee_Management.models;

import com.mongodb.lang.NonNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
@Data

public class Employee {
    @Id
    @Size(min = 2, message = "Employee ID should have at least 2 characters")
    @NonNull
    private String eid;

    @Size(min = 2, message = "Employee Name should have at least 2 characters")
    @NotBlank(message = "Name is mandatory")
    private String ename;

    @NotBlank(message = "Address is mandatory")
    private String address;

    @NotBlank(message = "Basic Salary is mandatory")
    private String basicsalry;

    @NotBlank(message = "Designation is mandatory")
    private String designation;

    @NotBlank(message = "Email is mandatory")
    @Email
    private String email;

    private String status;


    @NotBlank(message = "Department is mandatory")
    private String department;

    @NotBlank(message = "Bank Name  is mandatory")
    private String nameOfBank;

    @NotBlank(message = "Bank branch is mandatory")
    private String branch;

    @NotBlank(message = "User Role is mandatory")
    private String userRole;

    @Size(min = 1, max = 12, message = "Account Number should have at least 2 numbers and maximum 12 number ")
    private String accountNo;

    private String password;

    private Date joinedDate;


    @NotBlank(message = "NIC number is mandatory")
    private String nic;

    private MultipartFile nicImage;

}
