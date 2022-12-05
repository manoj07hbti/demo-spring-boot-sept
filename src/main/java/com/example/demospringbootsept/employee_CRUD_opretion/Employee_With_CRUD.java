package com.example.demospringbootsept.employee_CRUD_opretion;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Employee_With_CRUD {

    ArrayList<Employee> employeeArrayList=new ArrayList<>();

    @RequestMapping("/add_employee_with_crud")
    public Employee addEmployee(@RequestBody Employee employee){

        employeeArrayList.add(employee);

        return employee;
    }
    @RequestMapping("/get_employee_with_crud")
    public  ArrayList<Employee> getEmployeeData(){

        return employeeArrayList;
    }

}
