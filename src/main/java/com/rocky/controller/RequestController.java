package com.rocky.controller;


import com.rocky.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {


    @PostMapping("/storeEmployeeData")
    public String storeEmployeeData(Employee employee) {



        return null;
    }
}
