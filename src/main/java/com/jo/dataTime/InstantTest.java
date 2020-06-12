package com.jo.dataTime;

import java.time.Duration;
import java.time.Instant;

public class InstantTest {

    public static void main(String[] args) {

        System.out.println(Instant.now());
        System.out.println(Instant.ofEpochSecond(2000));


        System.out.println(Duration.ofDays(30));




    }
}
