package com.example.demospringbootsept.CRUDOperations;

import com.example.demospringbootsept.model1.Vehicle;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Vehicle__CRUD_Operation_PathController {
    ArrayList<Vehicle> getBikeInfo = new ArrayList<>();
    @RequestMapping(value="/add_bike",method = RequestMethod.POST)
    public Vehicle getName(@RequestBody Vehicle motorcycle){
        getBikeInfo.add(motorcycle);
        return motorcycle;
    }
    @RequestMapping(value="/read_bike",method=RequestMethod.GET)
    public ArrayList<Vehicle> readValue(){
        return getBikeInfo;
    }
    @RequestMapping(value="/update_bike/{index}/{colour}",method=RequestMethod.PUT)
    public String update(@PathVariable int index,@PathVariable String colour){
        Vehicle updateInfo=getBikeInfo.get(index);
       updateInfo.setColour(colour);
        return "Name Update Succesfully";
    }
    @RequestMapping(value="/remove_bike/{index}",method = RequestMethod.DELETE)
    public String deletedata(@PathVariable  int index){
        getBikeInfo.remove(index);
        return "Succesfully Deleted";

    }

}
