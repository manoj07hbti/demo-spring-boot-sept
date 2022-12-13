package com.example.demospringbootsept.assignmentController;

import com.example.demospringbootsept.model.Vehicle;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AssignmentVehicle {

    ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();


    @RequestMapping("/add_vehicle" )
    public String addVehicle(@RequestParam String vehicleType,@RequestParam String vehicleName, @RequestParam int price,@RequestParam int power){
        Vehicle v1 = new Vehicle(vehicleType,vehicleName,price,power);
        vehicleArrayList.add(v1);
        return "Vehicle added in list successfully";
    }

    @RequestMapping("/get_all_vehicle")
    public ArrayList<Vehicle> get_all_vehicle(){
        return vehicleArrayList;
    }

    @RequestMapping("/get_vehicle")
    public Vehicle get_Vehicle(@RequestParam int index){
        return vehicleArrayList.get(index);
    }

    @RequestMapping("/update_vehicleType/{index}/{vehicleType}")
    public String update_vehicleType(int index,String vehicleType){
        vehicleArrayList.get(index).setVehicleType(vehicleType);
        return "Vehicle Type Updated Successfully";
    }




}
