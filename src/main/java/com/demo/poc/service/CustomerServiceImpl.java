package com.demo.poc.service;

import com.demo.poc.repository.CustomerRepository;
import com.demo.poc.dto.CustomerDTO;
import com.demo.poc.entity.CustomerEntity;
import com.demo.poc.mapper.CustomerMapper;
import com.demo.poc.repository.CustomerRepositoryImpl;
import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

  private final CustomerMapper mapper;
  private final CustomerRepository repository;

  public CustomerServiceImpl() {
    mapper = new CustomerMapper();
    repository = new CustomerRepositoryImpl();
  }

  @Override
  public List<CustomerDTO> findAll() {
    List<CustomerEntity> customerEntities = repository.findAll();
    List<CustomerDTO> customerDTOS = new ArrayList<>();

    for (CustomerEntity customerEntity: customerEntities) {
      CustomerDTO customerDTO = mapper.toDTO(customerEntity);
      customerDTOS.add(customerDTO);
    }

    return customerDTOS;
  }

  @Override
  public CustomerDTO findByDni(String dni) {
    CustomerEntity entity = repository.findByDni(dni);
    return mapper.toDTO(entity);
  }
}
