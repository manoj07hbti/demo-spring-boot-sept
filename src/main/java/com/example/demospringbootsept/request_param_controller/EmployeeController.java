package com.example.demospringbootsept.request_param_controller;

import com.example.demospringbootsept.model1.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class EmployeeController {
    ArrayList<Employee> employeeArraylist = new ArrayList<>();

    @RequestMapping("/employee_info")
    public Employee info(@RequestParam String name, @RequestParam int age, @RequestParam int salary, @RequestParam String company) {
        Employee details = new Employee(name, age, salary, company);
        employeeArraylist.add(details);
        return details;

    }

    @RequestMapping("/employee_list")
    public ArrayList<Employee> getemployeeArraylist() {
        return employeeArraylist;
    }
}