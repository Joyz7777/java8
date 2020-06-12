package com.jo.dataTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateTest {


    public static void main(String[] args) {

        System.out.println(LocalDate.now());


        //Creating LocalDate by ZoneId
        System.out.println(LocalDate.now(ZoneId.of("Asia/Shanghai")));

        System.out.println(LocalDate.now(ZoneId.of("Asia/Kolkata")));




        //Creating LocalDate by providing  input arguments
        System.out.println(LocalDate.of(2020, 05, 20));


        LocalDate now = LocalDate.now();
        LocalDate localDate = now.ofEpochDay(200);
        System.out.println(localDate);

        System.out.println(LocalDate.ofYearDay(2020, 360));



    }
}
