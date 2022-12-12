package com.example.demospringbootsept.controller;

import com.example.demospringbootsept.model.Mobile;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class ass_Mobile_curd {

    ArrayList<Mobile>mobileArrayList=new ArrayList<>();
@RequestMapping(value = "/ add_mobile",method = RequestMethod.POST)
    public Mobile addMobile(@RequestBody Mobile mobile){

        mobileArrayList.add(mobile);
        return mobile;


    }
    @RequestMapping(value = "/ get_mobile",method = RequestMethod.GET)
    public ArrayList<Mobile>getList(){
        return mobileArrayList;


    }
@RequestMapping(value = "/update_mobile",method = RequestMethod.PUT)
    public String updateMobile(@PathVariable int index,@PathVariable String name){

     Mobile mobile = mobileArrayList.get(index);
     mobile.setBrand(name);

     return "list update Successfully==========";


    }
    @RequestMapping(value = "/remove_mobile",method = RequestMethod.DELETE)
public  String removeMobile(@RequestParam int index){
        mobileArrayList.remove(index);

        return "list remove successfully========";

}

}
