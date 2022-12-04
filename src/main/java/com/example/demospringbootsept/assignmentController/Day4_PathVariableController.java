package com.example.demospringbootsept.assignmentController;

import com.example.demospringbootsept.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Day4_PathVariableController {


    public ArrayList<Employee> employees = new ArrayList<>();


@RequestMapping("/check_odd/{number}")
    public String checkOdd(@PathVariable int number){
    //---------------------Assignment 1- ODD Number/Path Variable--------------------------------------------------

        String result = "" ;

        for(int i = 0 ; i <= number; i++)
        {
            if (i%2 != 0){

                result += " " + i+ " is Odd, ";
            }
//            else {
//                result = number +" is Even";
//            }
        }
        return result;
    }

    //---------------------Assignment 2- fibonacci Series/pathvariable-----------------------------------------------

    @RequestMapping("/fibpath/{count}")
    public String fibonacci(@PathVariable int count){

    int num1 = 0 ,num2 = 1, num3, i;
    String result = "fibonacci series is :" +num1+ " , " +num2;

    for(i=2; i<count;++i){
        num3 = num1+num2;
        result+= (" ,"+ num3);

        num1= num2;
        num2 = num3;
    }
    return result;
    }

    //---------------------Assignment 3- employee Data/pathvariable-----------------------------------------------

    @RequestMapping("/empdata_path/{empid}/{empName}/{empDept}/{deptId}")
    public Employee addemployee(@PathVariable int empid,@PathVariable String empName,@PathVariable String empDept,@PathVariable int deptId ){

        Employee employee = new Employee(empid,empName,empDept,deptId);
        employees.add(employee);
        return employee;
    }

    @RequestMapping("/employee_list_path")
    public ArrayList<Employee>  getEmployees() {

    return employees;

    }



}
