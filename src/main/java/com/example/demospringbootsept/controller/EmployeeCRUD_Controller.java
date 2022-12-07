package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeCRUD_Controller {

    ArrayList<Employee> empArrayList = new ArrayList<>();

    @RequestMapping(value = "/add_employee", method = RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee emp) {

        empArrayList.add(emp);

        return emp;
    }

    @RequestMapping(value = "/get_emp", method = RequestMethod.GET)
    public ArrayList<Employee> getInfo() {

        return empArrayList;
    }

    @RequestMapping(value = "/update_employee/{index}/{name}", method = RequestMethod.PUT)
    public String updateStudent(@PathVariable int index, @PathVariable String name){

        Employee emp = empArrayList.get(index);
        emp.setName(name);

        return "  Name Updated Successfully.....";
    }



    @RequestMapping(value = "/remove_employee", method = RequestMethod.DELETE)
    public String removeEmp(@RequestParam int index){

        empArrayList.remove(index);

        return "emp deleted successfully...";
    }


}
