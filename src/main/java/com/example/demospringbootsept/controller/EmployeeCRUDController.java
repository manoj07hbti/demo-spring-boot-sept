package com.example.demospringbootsept.controller;
import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeCRUDController {

    ArrayList <Employee> employeeArrayList=new ArrayList<>();
    //CRUD
    //1.C : CREATE /INSERT  ---> POST

    @RequestMapping(value="/add_employee", method= RequestMethod.POST)
    public Employee addEmployee(@RequestBody  Employee employee){
        employeeArrayList.add(employee);
        return employee;
    }

    @RequestMapping(value="/get_employee", method=RequestMethod.GET)
    public ArrayList<Employee> getData(){

        return employeeArrayList;
    }

    @RequestMapping(value="/update_employee/{index}/{name}", method=RequestMethod.PUT)
    public String updateEmployee(@PathVariable int index,@PathVariable String name){

        Employee employee=employeeArrayList.get(index);
        employee.setName(name);

        return "Name Updated successfully..";
    }

    @RequestMapping(value="/remove_employee", method = RequestMethod.DELETE)
    public String removeEmployee(@RequestParam int index){

        employeeArrayList.remove(index);

        return "Employee deleted Successfully";
    }
}
