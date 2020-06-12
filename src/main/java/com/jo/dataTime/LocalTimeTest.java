package com.jo.dataTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeTest {


    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.of(10,20,20));

        System.out.println(LocalTime.now(ZoneId.of("Asia/Kolkata")));

        System.out.println(LocalTime.ofSecondOfDay(2000));
    }
}
