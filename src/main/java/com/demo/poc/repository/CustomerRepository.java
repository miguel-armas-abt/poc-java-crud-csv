package com.demo.poc.repository;

import com.demo.poc.entity.CustomerEntity;
import java.util.List;

public interface CustomerRepository {

  List<CustomerEntity> findAll();

  CustomerEntity findByDni(String dni);
}
