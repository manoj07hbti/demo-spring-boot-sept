package com.example.demospringbootsept.CRUDOperations;

import com.example.demospringbootsept.model1.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Employee_CRUD_Controller {

    ArrayList<Employee> employeeDetail=new ArrayList<>();
    @RequestMapping("/add_employee")
    public Employee addEmployee(@RequestBody Employee employee){
        employeeDetail.add(employee);
        return employee;

    }
    @RequestMapping("/get_detail")
    public ArrayList<Employee> getData(){
        return employeeDetail;
    }
    @RequestMapping("/update_data")
    public String updateInfo(@RequestParam int index,@RequestParam String company){
        Employee updateCompany = employeeDetail.get(index);
        updateCompany.setCompany(company);
        return "company updated";


    }
    @RequestMapping("/salary")
    public String salary(@RequestParam int index ){
        employeeDetail.remove(index);
        return "Successfully deleted employee detail" ;
    }

}
