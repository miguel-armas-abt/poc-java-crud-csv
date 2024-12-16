package com.demo.poc.dao;

import com.demo.poc.commons.CsvReader;
import com.demo.poc.entity.CustomerEntity;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {

  private static final String FILE = "/database/customers.csv";
  private static final char SEPARATOR = ',';

  @Override
  public List<CustomerEntity> findAll() {
    List<CustomerEntity> customers = new ArrayList<>();
    try {
      CsvReader.getRecords(FILE, SEPARATOR)
          .forEach(csvRecord -> {
            String dni = csvRecord.get("DNI");
            String name = csvRecord.get("NAME");
            String email = csvRecord.get("EMAIL");

            CustomerEntity customer = new CustomerEntity();
            customer.setDni(dni);
            customer.setName(name);
            customer.setEmail(email);

            customers.add(customer);
          });
    } catch (Exception exception) {
      throw new IllegalArgumentException("ErrorReadingCSV", exception);
    }
    return customers;
  }

  @Override
  public CustomerEntity findByDni(String dni) {
    List<CustomerEntity> allCustomers = this.findAll();
    for (CustomerEntity customer: allCustomers) {
      if(customer.getDni().equals(dni)) {
        return customer;
      }
    }
    return null;
  }
}
