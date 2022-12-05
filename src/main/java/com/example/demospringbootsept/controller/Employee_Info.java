package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


    @RestController
    public class Employee_Info {

        @RequestMapping("/employee")
        public Employee getEmployeeInfo() {

            Employee obj = new Employee("Ajay", 26, "CS");
            {

                return obj;
            }
        }

        @RequestMapping("/employee_list")
        public ArrayList<Employee> getEmployeeList() {

            ArrayList<Employee> Emp = new ArrayList<>();

            Employee Emp1 = new Employee("Rajesh", 24, "ITI");
            Employee Emp2 = new Employee("Mohit", 25, "IT");
            Employee Employee420 = new Employee("Piyush", 30, "Electrical");

            Emp.add(Emp1);
            Emp.add(Emp2);
            Emp.add(Employee420);

            return Emp;
        }


    }

