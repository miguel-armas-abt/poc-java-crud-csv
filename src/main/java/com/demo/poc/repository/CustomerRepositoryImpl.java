package com.demo.poc.repository;

import com.demo.poc.dao.CustomerDAO;
import com.demo.poc.dao.CustomerDAOImpl;
import com.demo.poc.entity.CustomerEntity;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

  private final CustomerDAO customerDAO;

  public CustomerRepositoryImpl() {
    this.customerDAO = new CustomerDAOImpl();
  }

  @Override
  public List<CustomerEntity> findAll() {
    return customerDAO.findAll();
  }

  @Override
  public CustomerEntity findByDni(String dni) {
    return customerDAO.findByDni(dni);
  }

}
