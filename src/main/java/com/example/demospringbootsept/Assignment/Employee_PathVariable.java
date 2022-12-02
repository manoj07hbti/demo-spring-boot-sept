package com.example.demospringbootsept.Assignment;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Employee_PathVariable {

    // create method
    @RequestMapping("/employee/{name}/{dept}/{age}")
    public Employee getEmployeeInfo(@PathVariable String name ,@PathVariable String dept ,@PathVariable int age ){

        ArrayList<Employee>employees = new ArrayList<>();
        Employee employee = new Employee(name,dept,age);

        return employee;

    }
}
