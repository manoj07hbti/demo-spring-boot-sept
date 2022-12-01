package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeInfoController {
    @RequestMapping("/employee")
    public ArrayList<Employee> employeeArrayList(){
        ArrayList<Employee> list= new ArrayList<>();
        Employee emp1 =new Employee("Rucha",34,"clerk",20000);
        Employee emp2 =new Employee("R1cha",26,"cashier",26000);
        Employee emp3 =new Employee("Heena",34,"manager",30000);
        Employee emp4 =new Employee("Rihaan",34,"HR",25000);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

        return list;
    }
}
