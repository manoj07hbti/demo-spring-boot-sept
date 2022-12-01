package com.example.demospringbootsept.assignment_neeraj;
import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Demo_Employee {

    // create method
    @RequestMapping("/employee")
   public Employee getEmployeeInfo(){

       Employee obj= new Employee("Vijay","IT",34);
       return obj;
   }

@RequestMapping("/employeeList")
   public  ArrayList<Employee> getEmployeeList() {

       ArrayList<Employee> employees = new ArrayList<>();

       Employee employee1 = new Employee("Mohan","CBT",45);
       Employee employee2 = new Employee("Rajesh","IT",33);
       Employee employee3 = new Employee("Neeraj","IT",21);


       employees.add(employee1);
       employees.add(employee2);
       employees.add(employee3);

       return  employees;
   }



 }










