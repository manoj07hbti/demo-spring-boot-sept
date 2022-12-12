package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee2;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeCrudOperation {
    ArrayList<Employee2> employee2ArrayList= new ArrayList<>();
    //Todo Crud operation........

    //Todo 1-> c: create / insert....................>(POST)
    @RequestMapping(value= "/add_employee2", method = RequestMethod.POST)
    public Employee2 addEmployee(@RequestBody Employee2 employee2){
        employee2ArrayList.add(employee2);
        return employee2;
    }

    //Todo 2-> R: read ............................>(GET)
    @RequestMapping(value= "/get_employee2", method= RequestMethod.GET)
    public ArrayList<Employee2> getData(){

        return employee2ArrayList;
    }

    //Todo 3-> U: update..........................>(PUT)
    @RequestMapping(value= "/update_employee2/{index}/{name}", method= RequestMethod.PUT)
    public String updateEmployee2(@PathVariable int index, @PathVariable String name){
        Employee2 employee2= employee2ArrayList.get(index);
        employee2.setName(name);
        return "name update successfully";
    }

    //todo 4-> D: delete......................>(REMOVE)
    @RequestMapping(value= "/remove_employee2", method= RequestMethod.DELETE)
    public String removeEmployee2(@RequestParam int index){
        employee2ArrayList.remove(index);

        return "employee2 deleted successfully";
    }
}
