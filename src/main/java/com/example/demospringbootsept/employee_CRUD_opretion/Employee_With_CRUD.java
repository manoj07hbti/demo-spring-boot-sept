package com.example.demospringbootsept.employee_CRUD_opretion;

import com.example.demospringbootsept.model.Employee;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Employee_With_CRUD {

    ArrayList<Employee> employeeArrayList=new ArrayList<>();

    @RequestMapping(value = "/add_employee_with_crud",method = RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee employee){

        employeeArrayList.add(employee);

        return employee;
    }
    @RequestMapping(value = "/get_employee_with_crud",method = RequestMethod.GET)
    public  ArrayList<Employee> getEmployeeData(){

        return employeeArrayList;
    }

    @RequestMapping(value = "/update_employee_with_CRUD/{index}",method = RequestMethod.PUT)
    public String updateEmployee(@PathVariable ("index") int index,@RequestBody Employee employee){

        if(employee!=null){

            if(employee.getName()!=null){

               employeeArrayList.get(index).setName(employee.getName());

            }

            else if(employee.getAge()!=0){

                employeeArrayList.get(index).setAge(employee.getAge());
            }
            else if(employee.getDept()!=null){

                employeeArrayList.get(index).setDept(employee.getDept());
            }
        }


        return"Employee_Data_updated_successfully--->";
    }

    @RequestMapping(value = "/remove_employee_with_CRUD",method = RequestMethod.DELETE)
    public String removeEmployee(@RequestParam int index){

        employeeArrayList.remove(index);

        return "Employee_Deleted_Successfully--->";
    }
}
