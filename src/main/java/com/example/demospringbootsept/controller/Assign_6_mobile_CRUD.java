package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Mobile;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Assign_6_mobile_CRUD {
    ArrayList<Mobile> mobileArrayList = new ArrayList<>();

    @RequestMapping("/add_mobile")
    public String addMobile(@RequestBody Mobile mobile) {
        mobileArrayList.add(mobile);
        return "device details has been added";
    }
    @RequestMapping("/update_mobile/{index}")
    public String updateMobile(@PathVariable  int index,@RequestBody Mobile mobile){
        mobileArrayList.remove(index);
        mobileArrayList.add(index,mobile);
        return "mobile details at index "+index+" has been updated";
    }
    @RequestMapping("/get_mobile_data")
    public ArrayList<Mobile> mobileData()  {
        return mobileArrayList;
    }

    @RequestMapping("update_brand")
    public String updateBrand(@RequestParam int index ,@RequestParam String brand){
        Mobile mobile = mobileArrayList.get(index);
        mobile.setBrand(brand);
        return "mobile brand name has been updated";
    }
    @RequestMapping("update_model")
    public String updateModel(@RequestParam int index ,@RequestParam String model){
        Mobile mobile = mobileArrayList.get(index);
        mobile.setModel(model);
        return "mobile model name has been updated";
    }
    @RequestMapping("update_ram")
    public String updateRam(@RequestParam int index ,@RequestParam int ram){
        Mobile mobile = mobileArrayList.get(index);
        mobile.setRam(ram);
        return "mobile ram has been updated";
    }
    @RequestMapping("update_storage")
    public String updateStorage(@RequestParam int index ,@RequestParam int storage){
        Mobile mobile = mobileArrayList.get(index);
        mobile.setStorage(storage);
        return "mobile storage has been updated";
    }
    @RequestMapping("/delete_mobile")
    public String delete(int index){
        mobileArrayList.remove(index);
        return "mobile data has been deleted";
    }



}

