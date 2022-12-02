package com.example.demospringbootsept.assignmentController;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmpDataController {
    @RequestMapping("/employee_data")
    public Employee employee(){

        Employee obj = new Employee(1001,"Amit","IT",101);
        return obj;
    }


    @RequestMapping("/employees_data")
    public ArrayList<Employee>  getEmployeeList(){

        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee(1002,"Raj","IT",101);
        Employee employee2 = new Employee(1003,"Ratan","Account",102);
        Employee employee3 = new Employee(1004,"Nandu","Finance",103);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        return employees;
    }

}
