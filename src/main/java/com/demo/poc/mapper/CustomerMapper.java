package com.demo.poc.mapper;

import com.demo.poc.dto.CustomerDTO;
import com.demo.poc.entity.CustomerEntity;

public class CustomerMapper {

  public CustomerDTO toDTO(CustomerEntity entity) {
    CustomerDTO dto = new CustomerDTO();
    dto.setDni(entity.getDni());
    dto.setName(entity.getName());
    return dto;
  }

}
