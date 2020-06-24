package com.jo.repository;

import com.jo.entity.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface AdminRepository extends CrudRepository<Admin, Integer> {


}
