package com.demo.poc;

import com.demo.poc.service.CustomerService;
import com.demo.poc.service.CustomerServiceImpl;

public class Application {

  public static void main(String[] args) {

    CustomerService customerService = new CustomerServiceImpl();
    System.out.println(customerService.findAll());
    System.out.println(customerService.findByDni("76517368"));
  }

}