package com.example.demospringbootsept.assignmentController;


import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeCrudController {
    ArrayList <Employee> employeeArrayList = new ArrayList<>();


//    CRUD Operation
//    1.->  C - Create  - Post

    @RequestMapping(value = "/add_employee", method = RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee employee){

        employeeArrayList.add(employee);

        return employee;
    }
//     2. -> R  --  Read --------Get
    @RequestMapping(value = "/get_employee" , method = RequestMethod.GET)
    public  ArrayList<Employee> getData(){
        return employeeArrayList;
    }

    //     3. -> U  --  Update ------------- PUT

    @RequestMapping(value = "/update_employee/{index}/{name}" ,method = RequestMethod.DELETE )
    public String updateEmployee(@PathVariable int index, @PathVariable String name){
        Employee employee=employeeArrayList.get(index);
        employee.setEmpName(name);

        return "Name Update Successfully..";
    }
    //     3. -> D  --  Delete ------------- Del
    @RequestMapping(value = "/remove_employee", method = RequestMethod.DELETE )
    public String removeEmployee(@RequestParam int index){
        employeeArrayList.remove(index);

        return "Employee DeletedSuccessfully";

    }
}
