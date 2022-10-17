package com.example.Employee_Management.repository;

import com.example.Employee_Management.models.ERole;
import com.example.Employee_Management.models.Roles;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Roles,String> {
    Optional<Roles> findByName(ERole name);
}
