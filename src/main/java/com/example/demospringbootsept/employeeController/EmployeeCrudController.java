package com.example.demospringbootsept.employeeController;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class EmployeeCrudController {


    ArrayList<Employee> employeesArrayList=new ArrayList<>();

    @RequestMapping("/add_employee")
    public Employee addEmp(@RequestBody Employee employee){

        employeesArrayList.add(employee);

        return employee;
    }

    @RequestMapping("/get_employee_data")
    public ArrayList<Employee> getEmp(){

        return employeesArrayList;
    }
}
