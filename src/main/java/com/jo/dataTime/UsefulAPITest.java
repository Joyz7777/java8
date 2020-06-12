package com.jo.dataTime;

import javax.lang.model.element.VariableElement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class UsefulAPITest {


    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now.isLeapYear());

        System.out.println(now.atTime(LocalTime.now()));

        System.out.println(now.plusDays(20));
        System.out.println(now.minusDays(2));
        System.out.println(now.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println(now.until(now.with(TemporalAdjusters.lastDayOfYear())));
        Period until = now.until(now.with(TemporalAdjusters.lastDayOfYear()));
        System.out.println(until.getDays());


        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yy-MMM-dd")));

        LocalDateTime dt = LocalDateTime.parse("27:Apr:2014 21:39:48",
                DateTimeFormatter.ofPattern("d:MMM:uuuu HH:mm:ss"));
        System.out.println("Default format after parsing = "+dt);



    }
}
