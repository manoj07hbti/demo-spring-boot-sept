package com.example.demospringbootsept.controller;

//import com.example.demospringbootsept.model.Employee;
import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Assign2_Employee_Data {

   /* @RequestMapping("/employee1")
    public Employee emp(){
        Employee emp1 = new Employee("Rahul","Developer",1,55000.75);
        return emp1;
    }*/
    @RequestMapping("/employee_info")
    public ArrayList<Employee> info(){
        ArrayList<Employee> EmployeeInfo = new ArrayList<>();
        Employee emp1 = new Employee("Rahul","Developer",1,55000.75);
        Employee emp2 = new Employee("Sachin", "Developer",2,70000.00);
        Employee emp3 = new Employee("Saurabh","Testing",101,90000.50);
        EmployeeInfo.add(emp1);
        EmployeeInfo.add(emp2);
        EmployeeInfo.add(emp3);
        return EmployeeInfo;
    }
}
