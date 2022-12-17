package com.example.demospringbootsept.CRUDOperations;

import com.example.demospringbootsept.model1.Vehicle;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Vehicle_CRUD_Operation {
    ArrayList <Vehicle> getInfo=new ArrayList<>();
    @RequestMapping(value="/add_data",method=RequestMethod.POST)
    public Vehicle company(@RequestBody Vehicle vehicle){
        getInfo.add(vehicle);
        return vehicle;
    }
    @RequestMapping(value="/read",method=RequestMethod.GET)
    public ArrayList<Vehicle> readData(){
        return getInfo;

    }
    @RequestMapping(value="/update_data",method=RequestMethod.PUT)
    public String update(@RequestParam int index,@RequestParam String company){
       Vehicle updateCompany=getInfo.get(index);
       updateCompany.setCompany(company);
       return "Company ANme update Successsfully";
    }
    @RequestMapping(value="/remove)_data",method=RequestMethod.DELETE)
    public String remove(@RequestParam int index){
        getInfo.remove(index);
        return "Data Delete succesfully";
    }
}
