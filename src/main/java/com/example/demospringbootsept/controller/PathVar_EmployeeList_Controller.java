package com.example.demospringbootsept.controller;


import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PathVar_EmployeeList_Controller {


    @RequestMapping("/employee_list/{name}/{salary}/{id}/{company}")
    public ArrayList<Employee> employeesArray_list(@PathVariable String name, @PathVariable int salary,
                                                   @PathVariable int id, @PathVariable String company) {

        ArrayList<Employee> employees_list = new ArrayList<>();

        Employee employee1 = new Employee(name, salary, id, company);
        Employee employee2 = new Employee(name, salary, id, company);
        Employee employee3 = new Employee(name, salary, id, company);
        Employee employee4 = new Employee(name, salary, id, company);
        Employee employee5 = new Employee(name, salary, id, company);


        employees_list.add(employee1);
        employees_list.add(employee2);
        employees_list.add(employee3);
        employees_list.add(employee4);
        employees_list.add(employee5);

        return employees_list;


    }


}
