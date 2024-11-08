package com.demo.poc.service;

import com.demo.poc.dto.CustomerDTO;
import java.util.List;

public interface CustomerService {

  List<CustomerDTO> findAll();

  CustomerDTO findByDni(String dni);
}
