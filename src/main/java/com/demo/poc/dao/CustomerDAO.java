package com.demo.poc.dao;

import java.util.List;

import com.demo.poc.entity.CustomerEntity;

public interface CustomerDAO {

  List<CustomerEntity> findAll();

  CustomerEntity findByDni(String dni);
}
