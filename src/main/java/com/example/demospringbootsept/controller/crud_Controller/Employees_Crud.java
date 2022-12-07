package com.example.demospringbootsept.controller.crud_Controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Employees_Crud {
    //CRUD
    //TODO C: create/insert
    ArrayList<Employee> employeeArrayList = new ArrayList<>();

    @RequestMapping(value = "/add_emp", method = RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee info) {
        employeeArrayList.add(info);
        return info;
    }

    @RequestMapping(value = "/get_emp", method = RequestMethod.GET)
    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    //todo update crud method
    @RequestMapping(value = "/update_name/{index}/{name}" ,method = RequestMethod.PUT)
    public String updateEmployees(@PathVariable int index, @PathVariable String name) {
        Employee emp = employeeArrayList.get(index);
        emp.setName(name);
        return "change name";
    }

    //todo remove  crud method

    @RequestMapping(value = "/remove" , method = RequestMethod.DELETE)
    public String removeEmployees(@RequestParam int index) {
        employeeArrayList.remove(index);
        return "remove successful";
    }
}
