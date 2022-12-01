package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class ass_employeeList {


    @RequestMapping("/employee")
    public ArrayList<Employee> list() {


        ArrayList<Employee> list = new ArrayList<>();

        Employee employee1 = new Employee("Ravi:", 25, "it:", "Kanpur");
        Employee employee2 = new Employee("Deepak:", 29, "it", "Goa");
        Employee employee3 = new Employee("Anurag:", 27, "it", "Agar");
        Employee employee4 = new Employee("Rahul:", 27, "cs:", "Lucknow");


        list.add(employee1);
        list.add(employee2);
        list.add(employee3);


        list.add(employee4);

        return list;

    }


}
