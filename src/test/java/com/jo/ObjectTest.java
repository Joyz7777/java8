package com.jo;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObjectTest {





    @Test
    public void testisNull (){
        String str = null;
        List list = new ArrayList();

        System.out.println(Objects.isNull(list));

    }


    @Test
    public void test(){
        String s= new String();

    }
    @Test
    public void twoSum() {

        int[] nums = {2,49,7};
        int target = 9;
        //控制循环总轮数
        for (int i = 0; i < nums.length - 1; i++) {
            //控制每次循环次数
            for (int j = 1; j < nums.length-1; j++) {
                if (nums[i] + nums[j] == target) {
                    nums = null;
                    nums[0] = i;
                    nums[1] = j;
                    System.out.println(nums);
                }
            }

        }
        //return null;
    }




}
