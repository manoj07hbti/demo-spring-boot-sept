package java.com.example.demoSpring.boot.project3.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo_controller {

    @RequestMapping("/Dishes")
    public void Dishes(){
        System.out.println("Pav bhaji, Pizza");

    }

    @RequestMapping("/Cube")
    public int makeCube(){
        int a=2;
        return 2*2*2;
    }
    @RequestMapping("/Sub")
    public int subtract(){

        int a = 5;
        int b = 10;
        return a-b;
    }

    @RequestMapping("/Devi")
    public int Devide(){
        int a= 9;
        int b= 3;
        return a/b;

    }
    @RequestMapping("/Multi")
    public int Multiply(){
        int a = 9;
        int b = 9;
        return a*b;
    }



}
