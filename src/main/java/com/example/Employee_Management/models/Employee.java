package com.example.Employee_Management.models;

import com.mongodb.lang.NonNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
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
    @NotBlank(message = "Status is mandatory")
    private String status;
    @NotBlank(message = "Department is mandatory")
    private String department;
    @NotBlank(message = "Bank Name  is mandatory")
    private String name_of_bank;
    @NotBlank(message = "Bank branch is mandatory")
    private String branch;
    @NotBlank(message = "Account Number is mandatory")
    @NotBlank(message = "User Role is mandatory")
    private String userRole;
    @Size(min = 1,max = 12,message = "Account Number should have at least 2 numbers and maximum 12 number ")
    private String account_no;

    private String password = String.valueOf(passwordGenerator());




    public char[] passwordGenerator() {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "1234567890";
        String charcter = "@#$%^&*+_";

        String combination = upper + lower + num + charcter;
        int len = 8;
        char[] password = new char[len];
        Random r = new Random();
        for (int i = 0; i < len; i++) {
            password[i] = combination.charAt(r.nextInt(combination.length()));

        }

        return password;


    }

}
