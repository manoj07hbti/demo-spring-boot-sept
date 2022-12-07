package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class EmployeeCRUDController {
    ArrayList<Employee> EmployeeArrayList = new ArrayList<>();
    @RequestMapping(value = "/add_employee", method = RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee Employee){

        EmployeeArrayList.add(Employee);
        return Employee;
    }
    @RequestMapping(value ="/get_employee", method = RequestMethod.GET)
    public ArrayList<Employee> getData(){
        return EmployeeArrayList;
    }
    @RequestMapping(value ="/update_employee/{index}/{name}", method =RequestMethod.PUT)
    public String updateEmployee (@PathVariable int index , @PathVariable String name){
        Employee employee= EmployeeArrayList.get(index);
        employee.setName(name);
        return "Name Updated Successfully ";
    }
    @RequestMapping(value ="/remove_employee", method = RequestMethod.DELETE)
    public String removeEmployee(@RequestParam int index){
        EmployeeArrayList.remove(index);
        return "Employee Deleted Successfully ";
    }

}
