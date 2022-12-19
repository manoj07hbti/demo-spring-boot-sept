package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import com.example.demospringbootsept.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeDBController {

    @Autowired
    EmployeeService service;

    @PostMapping("/add_emp_db")  // @RequestMapping(value = "/add_student",method = RequestMethod.POST)
    public String addEmployee(@RequestBody Employee employe){

        return service.add(employe);
    }

    @GetMapping("/get_all_emp")  // @RequestMapping(value = "/get_students", method = RequestMethod.GET)
    public List<Employee> getAll(){

        return service.getAllEmp();
    }

    @PutMapping("/update_emp_db/{code}/{name}")  //@RequestMapping(value = "/update_student/{index}/{name}", method = RequestMethod.PUT)
    public String update(@PathVariable Long code,@PathVariable String name){

        return service.update(code, name);
    }

    @DeleteMapping("/delete_emp_db/{code}")  // @RequestMapping(value = "/remove_student", method = RequestMethod.DELETE)
    public String delete(@PathVariable Long code){

        return service.delete(code);
    }
    @GetMapping("/find_by_code")
    public Employee getByCode(@RequestParam Long code){
        return service.getEmpByCode(code);
    }

    @GetMapping("/find_by_name")
    public Employee getByName(@RequestParam String name){
        return service.getEmpByName(name);
    }

    @GetMapping("/find_by_name_code")
    public Employee getByNameAndCode(@RequestParam String name,@RequestParam Long code){
        return service.getEmpByNameAndCode(name, code);
    }

    @GetMapping("/find_by_query")
    public Employee getEmpByQuery(@RequestParam String name, @RequestParam Long code){
        return service.getEmpByQuery(name, code);
    }

    @GetMapping("/findall_by_query")
    public List<Employee> getAllEmp(@RequestParam String department){
        return service.getAllEmpQuery(department);
    }
}
