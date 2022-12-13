package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Vehicle;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;

@RestController
public class Assign_7_vehicle_CRUD {
    ArrayList<Vehicle> vehicle_arraylist = new ArrayList<>();

    @RequestMapping(value="/add_vehicle", method = RequestMethod.POST)
    public String add_vehicle(@RequestParam String company, @RequestParam String model, @RequestParam double price) {
        Vehicle v1 = new Vehicle(company, model, price);
        vehicle_arraylist.add(v1);
        return "Vehicle has been added ";
    }

    @RequestMapping(value="/get_vehicles", method = RequestMethod.GET)
    public ArrayList<Vehicle> get_vehicles() {
        return vehicle_arraylist;
    }

    @RequestMapping(value="/get_vehicle", method = RequestMethod.GET)
    public Vehicle get_vehicle(int index) {
        return vehicle_arraylist.get(index);
    }

    @RequestMapping(value="update_company/{index}/{company}", method = RequestMethod.PUT)
    public String update_company(@PathVariable int index, @PathVariable String company) {
        vehicle_arraylist.get(index).setCompany(company);
        return "company has been updated";
    }

    @RequestMapping(value="update_model/{index}/{model}", method = RequestMethod.PUT)
    public String update_model(@PathVariable int index, @PathVariable String model) {
        vehicle_arraylist.get(index).setModel(model);
        return "model has been updated";
    }

    @RequestMapping(value="update_price/{index}/{price}", method = RequestMethod.PUT)
    public String update_price(@PathVariable int index, @PathVariable double price) {
        vehicle_arraylist.get(index).setPrice(price);
        return "price has been updated";
    }
     @RequestMapping(value="/remove_vehicle", method = RequestMethod.DELETE)
    public String remove_vehicle(@RequestParam int index){
        vehicle_arraylist.remove(index);
        return "Vehicle has been removed";
     }

}
