package com.demo.poc.dao;

import com.demo.poc.entity.CustomerEntity;
import java.util.List;

public interface CustomerDAO {

  List<CustomerEntity> findAll();

  CustomerEntity findByDni(String dni);
}
