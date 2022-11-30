package com.example.demospringbootsept.controllerMath;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OddController {

    @RequestMapping("/odd_number")
    public String oddNumber() {
        String result = "Odd Number Between 1 to 100 are....";

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                result = result + " , " + i;
            }
        }
        return result;
    }
    @RequestMapping("/even_number")
    public String evenNumber(){

        String result1="Print even number between 1 to 50 are...";
        for (int i=1; i<=50; i++){
            if(i%2==0){
                result1=result1 + " , " +i;
            }
        }
        return result1;
    }

}
