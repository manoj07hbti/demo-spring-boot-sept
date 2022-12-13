package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Vehicle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Vehicle_Controller {

    ArrayList<Vehicle> vehiclelist = new ArrayList<>();

    @RequestMapping(value = "/post_vehicle", method = RequestMethod.POST)
    public String post_vehicle(@RequestParam String name, @RequestParam String model, @RequestParam double size, @RequestParam double prize) {
        Vehicle vcl = new Vehicle(name, model, size, prize);
        vehiclelist.add(vcl);
        return "vehicle has added";
    }


    @RequestMapping(value = "/get_vehicle", method = RequestMethod.GET)
    public ArrayList<Vehicle> get() {
        return vehiclelist;

    }

    @RequestMapping(value = "/getting vehicle", method = RequestMethod.GET)
    public Vehicle getting(int index) {
        return vehiclelist.get(index);

    }

    @RequestMapping(value = "/put_name", method = RequestMethod.PUT)
    public String name(@RequestParam int index, @RequestParam String name) {
        vehiclelist.get(index).setName(name);
        return "name successfully updated";
    }

    @RequestMapping(value = "/put_model", method = RequestMethod.PUT)
    public String model(@RequestParam int index, @RequestParam String model) {
        vehiclelist.get(index).setModel(model);
        return "model successfully updated";
    }

    @RequestMapping(value = "/put_size", method = RequestMethod.PUT)
    public String size(@RequestParam int index, @RequestParam double size) {
        vehiclelist.get(index).setSize(size);
        return "size successfully updated";
    }

    @RequestMapping(value = "/put_price", method = RequestMethod.PUT)
    public String price(@RequestParam int index, @RequestParam double prize) {
        vehiclelist.get(index).setPrize(prize);
        return "price successfully updated";
    }

    @RequestMapping(value = "/delete_vehichle", method = RequestMethod.DELETE)
    public String delete_vehicle(@RequestParam int index) {
        vehiclelist.remove(index);
        return "data removed successfully";

    }


}
