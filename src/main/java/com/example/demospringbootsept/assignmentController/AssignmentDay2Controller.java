package com.example.demospringbootsept.assignmentController;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentDay2Controller {

    @RequestMapping("/odd_number")
    public String oddNumber(){

        String result = "Odd number between 1 to 100 are :";

        for (int i = 0; i<=100; i++){

            if(i%2 != 0 ){

                result = result + ", "+ i;

            }
        }
        return result;
    }
    @RequestMapping("/fibonacci")
    public String fibonacci(){

        int num1 = 0,num2 = 1 ,num3,i,count = 10;
        String result = ("Fibonacci series is :" + num1+ " " + num2);

        for( i = 2; i<count; ++i){
            num3 = num1+num2;
            result = (" "+num3);
            num1 = num2;
            num2 = num3;

            result+= result;

        }
        return result;
    }

}
