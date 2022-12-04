package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PathVariableController {

    ArrayList<Employee> employe=new ArrayList<>();

    @RequestMapping("/check_number/{number}")
    public String checkOddEven(@PathVariable int number){

        String msg="";
        if (number%2==0){
            msg="Number is EVEN";
        }
        else {
            msg="Number is ODD";
        }
        return msg;
    }

    @RequestMapping("/check_voting/{age}/{city}")
    public String checkElligibility(@PathVariable int age,@PathVariable String city){
        String msg="";
        if (age>=18 && city.equals("Agra")){
            msg="Person is elligible for voting";
        }
        else {
            msg="Person is NOT elligible for voting";
        }
        return msg;
    }

    @RequestMapping("/create_employee/{name}/{department}/{code}")
    public Employee createEmployee(@PathVariable String name,@PathVariable String department,@PathVariable int code){

        Employee employee1=new Employee(name, department, code);
        employe.add(employee1);

        return employee1;
    }

    public ArrayList<Employee> getemployee(){
        return employe;
    }

    @RequestMapping("/addition/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b){
        String msg="";
        int sum=a+b;
        return "Addition of a+b="+sum;
    }
}
