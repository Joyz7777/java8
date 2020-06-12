package com.jo.dataTime;

import javafx.scene.input.DataFormat;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTimeTest {




    @Test
    public void TestLocalDateTimeAPI(){


        //creat a Util date
        Date date = new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(date);
        System.out.println(localDateTime);

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        Date dateTime = Date.from(time.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(dateTime);

        long l = time.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();



    }

    @Test
    public void testDateFormatter(){




        LocalDateTime now = LocalDateTime.now();

        System.out.println(now.format(DateTimeFormatter.ofPattern("kk-mm-ss")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("KK-mm-ss")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("D")));
    }
}
