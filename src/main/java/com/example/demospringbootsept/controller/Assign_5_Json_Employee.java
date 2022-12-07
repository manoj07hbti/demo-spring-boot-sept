package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Assign_5_Json_Employee {
    ArrayList<Employee> employees = new ArrayList<>();

    @RequestMapping("/add_employee")
    public Employee addInfo(@RequestBody Employee employee) {
        employees.add(employee);
        return employee;
    }

    @RequestMapping("/get_employees_info")
    public ArrayList<Employee> info() {
        return employees;
    }

    @RequestMapping("get_employee_info/{index}")
    public Employee info(@PathVariable int index) {
        return employees.get(index);
    }


    @RequestMapping("/update_name/{index}/{name}")
    public String updateName(@PathVariable int index, @PathVariable String name) {
        employees.get(index).setName(name);
        return "name has been changed successfully";
    }

    @RequestMapping("/update_dpt/{index}/{dpt}")
    public String updateDpt(@PathVariable int index, @PathVariable String dpt) {
        employees.get(index).setDepartment(dpt);
        return "Department has been changed successfully";
    }

    @RequestMapping("/update_id/{index}/{id}")
    public String updateId(@PathVariable int index, @PathVariable int id) {
        employees.get(index).setId(id);
        return "Id has been changed successfully";
    }

    @RequestMapping("/update_salary/{index}/{salary}")
    public String updateSalary(@PathVariable int index, @PathVariable Double salary) {
        employees.get(index).setSalary(salary);
        return "Salary has been changed successfully";
    }

    @RequestMapping("/update_profile")
    public String updateProfile(@RequestBody Employee employee, @RequestParam int index) {
       try{
           employees.remove(index);
        employees.add(index, employee);
        return "Employee has been updated";
       }
        catch (Exception e){
           return "Please select valid option";
        }

    }

    @RequestMapping("/delete_profile")
    public String updateName(@RequestParam int index) {
        employees.remove(index);
        return "name has been deleted successfully";
    }
}