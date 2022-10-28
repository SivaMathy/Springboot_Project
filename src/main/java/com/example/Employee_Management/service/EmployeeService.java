package com.example.Employee_Management.service;

import com.example.Employee_Management.models.Employee;
import com.example.Employee_Management.repository.EmployeeRepository;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    private GridFsTemplate template;

    @Autowired
    private GridFsOperations operations;
//    public Employee addEmployee(Employee employee){
//        return employeeRepository.save(employee);
//    }

    public Employee addEmployee(Employee employee, MultipartFile upload) throws IOException {

        DBObject metadata = new BasicDBObject();
        metadata.put("fileSize", upload.getSize());

        Object fileID = template.store(upload.getInputStream(), upload.getOriginalFilename(), upload.getContentType(), metadata);

        return employeeRepository.save(employee);
    }

}
