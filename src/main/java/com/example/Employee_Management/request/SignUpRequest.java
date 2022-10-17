package com.example.Employee_Management.request;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Random;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class SignUpRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;


    private Set<String> roles;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;




}
