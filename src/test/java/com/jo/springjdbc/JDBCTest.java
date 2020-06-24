package com.jo.springjdbc;


import com.jo.ApplicationConfig;
import com.jo.entity.Admin;
import com.jo.repository.AdminRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class JDBCTest {

    @Autowired
    AdminRepository repository;


    @Test
    public void test1(){
        Optional<Admin> byId = repository.findById(10);
        System.out.println(byId.get());

    }


}
