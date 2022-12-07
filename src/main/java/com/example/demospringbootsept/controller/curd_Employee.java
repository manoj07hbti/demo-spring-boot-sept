package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class curd_Employee {
    ArrayList<Employee> listEmployees = new ArrayList<>();

    @RequestMapping(value = "/add_employee",method =RequestMethod .POST )
    public Employee add(@RequestBody Employee list) {

        listEmployees.add(list);
        return list;


    }

    @RequestMapping(value = "/getting_employee",method = RequestMethod.GET)
    public ArrayList<Employee> getData() {
        return listEmployees;


    }

    @RequestMapping(value = "/update_Employee/{index}/{name}",method = RequestMethod.PUT)
    public String updateEmployee(@PathVariable int index, @PathVariable String name) {
        Employee employee = listEmployees.get(index);
        employee.setName(name);
        return "Name updated Successfully";


    }

    @RequestMapping(value = "/remove_employee",method = RequestMethod.DELETE)
    public String removeEmployee(@RequestParam int index) {
        listEmployees.remove(index);
        return "Employee deleted successfully..";


    }


}
