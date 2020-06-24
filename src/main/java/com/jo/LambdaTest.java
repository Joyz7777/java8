package com.jo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LambdaTest {

    final static String salutation = "Hello! ";







    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }


    public static void main(String[] args) {

        GreetingService greetService1 = message ->
                System.out.println(salutation + message);
        greetService1.sayMessage("Runoob");


        LambdaTest lambdaTest = new LambdaTest();
        MathOperation subtraction = (a, b) -> a - b;


        System.out.println(lambdaTest.operate(5,2,(x,y) -> x  *  y));


        GreetingService service = (msg) -> {
            String collect = Arrays.stream(msg.split(",")).collect(Collectors.joining());
            System.out.println(collect);
        };
        service.sayMessage("ss,,,sszxcasasx,as,da,,aga,fas,da,zc,z,fada");


    }










interface MathOperation {
    int operation(int a, int b);
}

interface GreetingService {
    void sayMessage(String message);
}


}