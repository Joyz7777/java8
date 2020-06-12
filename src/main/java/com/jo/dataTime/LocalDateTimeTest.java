package com.jo.dataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class LocalDateTimeTest {


    public static void main(String[] args) {

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));

        System.out.println(LocalDateTime.ofEpochSecond(20000, 200, ZoneOffset.UTC));


    }
}
