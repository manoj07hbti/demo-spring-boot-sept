package com.example.demospringbootsept.controllerMath;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    @RequestMapping("/get_emp")
    public Employee getEmployeeDetails(){

        Employee employee=new Employee("Mohit","Railway",55000,35);
        return employee;
    }


    @RequestMapping("/get_emp_list")
    public ArrayList<Employee> getEmployeeList(){

        ArrayList<Employee> employees=new ArrayList<>();
        Employee employee1=new Employee("Sagar","IT",70000,29);
        Employee employee2=new Employee("Vijay","Civil",35000,26);
        Employee employee3=new Employee("Shankar","Airforce",65000,23);
        Employee employee4 =new Employee("Gaurav","Education",32,49000);


        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        return employees;
    }
}
