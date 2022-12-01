package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class EmployeeList_Controller {

    @RequestMapping("/employee_list")
    public ArrayList<Employee> employeesArray_list() {

        ArrayList<Employee> employees_list = new ArrayList<>();


        Employee emp1 = new Employee("PREM", 50000, 235, "INFOSYS");
        Employee emp2 = new Employee("SHALU", 65000, 023, "MAHINDRA");
        Employee emp3 = new Employee("PREETI", 75000, 125, "TATA");
        Employee emp4 = new Employee("ANJALI", 39000, 005, "MARUTI");
        Employee emp5 = new Employee("ARVIND", 56000, 987, "TCS");

        employees_list.add(emp1);
        employees_list.add(emp2);
        employees_list.add(emp3);
        employees_list.add(emp4);
        employees_list.add(emp5);

        return employees_list;


    }


    }
