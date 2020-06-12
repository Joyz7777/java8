package com.jo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class ObjectTest {


    public static void main(String[] args) {


        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(4);
        integers.add(8);


        String str1 = null;
        String str2 = "222";
        String str3 = "22";
        System.out.println(Objects.equals(str1, str2));
        try {

            System.out.println(Objects.compare(null, 20, (x, y) -> x.compareTo(y)));


        } catch (NullPointerException e) {

            throw new RuntimeException("对比的值为null");
        }




    }


}
