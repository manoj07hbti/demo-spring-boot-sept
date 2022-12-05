package crudc_controller;

import model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Employee_Crud {

    ArrayList<Employee> employeeArrayList=new ArrayList<>();
    @RequestMapping("/add_emp_crud")
    public Employee addEmployee(@RequestBody Employee employee){
        employeeArrayList.add(employee);

        return employee;
    }
    @RequestMapping("/get_emp_crud")
    public  ArrayList<Employee> getEmployeeArrayList(){
        return employeeArrayList;
    }
}
