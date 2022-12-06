package com.example.demospringbootsept.controller.controller_Program;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employees {
    @RequestMapping("/info")
    public Employee getInfo(){
        Employee obj = new Employee("Rohan",30,"manager",20000);
       return obj;
    }
}
