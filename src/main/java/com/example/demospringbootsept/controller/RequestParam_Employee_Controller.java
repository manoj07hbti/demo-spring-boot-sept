package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RequestParam_Employee_Controller {


    @RestController
    public class PathVar_Employee_Controller {


        @RequestMapping("/employee_request_param")
        public Employee employeeInfo(@RequestParam String name, @RequestParam int salary, @RequestParam int id, @RequestParam String company) {

            Employee employee = new Employee(name, salary, id, company);

            return employee;

        }
    }
}
