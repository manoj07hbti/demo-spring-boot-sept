package com.example.demospringbootsept.car_CRUD_application;

import com.example.demospringbootsept.model.Car;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class Car_CRUD {

    ArrayList<Car> Carlist=new ArrayList<>();

    @RequestMapping(value = "/add_car",method = RequestMethod.POST)
    public ArrayList<Car> addcar(@RequestBody Car car){

        Carlist.add(car);

        return Carlist;
    }
    @RequestMapping(value = "/get_car",method = RequestMethod.GET)
    public ArrayList<Car> getCarlist(){

        return Carlist;
    }
    @RequestMapping(value = "/update_car/{index}",method = RequestMethod.PUT)
    public String updateCar(@PathVariable ("index") int index,@RequestBody Car car ){

        if(car!=null){

            if(car.getBrand()!=null){

                Carlist.get(index).setBrand(car.getBrand());

            }

            else if (car.getPrice()!=0){

                Carlist.get(index).setPrice(car.getPrice());
            }

            else if (car.getWheel()!=0){

                Carlist.get(index).setWheel();
            }

        }
        return "car update successfully";
    }



    @RequestMapping(value = "/remove_car/{index}",method = RequestMethod.DELETE)
    public String removeCar(@RequestParam int index){

        Carlist.remove(index);

        return "Car remove Successfully-----";
    }
}
