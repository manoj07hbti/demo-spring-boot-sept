package com.example.demospringbootsept.assignmentController;


import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeCrudController {


    ArrayList<Employee> employeeArrayList = new ArrayList<>();

@RequestMapping("/add_employee")
    public Employee addEmployee(@RequestBody Employee employee){
        employeeArrayList.add(employee);
        return employee;
    }

    @RequestMapping("/get_employee")
    public  ArrayList<Employee> getData(){
        return employeeArrayList;
    }

}
