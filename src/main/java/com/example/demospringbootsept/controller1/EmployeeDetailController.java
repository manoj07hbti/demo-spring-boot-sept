package com.example.demospringbootsept.controller1;

import com.example.demospringbootsept.model1.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeDetailController {
    @RequestMapping("/employee_detail")
    public Employee infoEmployee() {
        Employee obj = new Employee("Vishal", 45000, 24, "Wipro");
        return obj;
    }

    @RequestMapping("/employees_details")
    public ArrayList<Employee> getInfoEmployee() {
        ArrayList<Employee> employee = new ArrayList<>();
        Employee obj4 = new Employee("Akash", 41000, 25, "Tata");
        Employee obj1 = new Employee("Viash", 23000, 25, "Wipro");
        Employee obj2 = new Employee("Subash", 65000, 25, "HCL");
        Employee obj3 = new Employee("Ekanksh", 48000, 25, "Cognizant");
        employee.add(obj1);
        employee.add(obj2);
        employee.add(obj3);
        employee.add(obj4);
        return employee;
    }
}
