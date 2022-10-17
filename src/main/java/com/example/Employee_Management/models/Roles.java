package com.example.Employee_Management.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document
@Data

public class Roles {
    @Id
    private String id;

    private ERole name;
}
