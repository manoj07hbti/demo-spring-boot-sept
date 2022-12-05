package com.example.demospringbootsept.pathVariableController;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmpController {



    @RequestMapping("/emp/{name}/{department}/{salary}/{age}")
    public Employee employee(@PathVariable String name, @PathVariable String department,@PathVariable int salary,@PathVariable int age){

        Employee employee=new Employee(name,department,salary,age);
        return employee;
    }
}
