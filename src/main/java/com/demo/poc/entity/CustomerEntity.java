package com.demo.poc.entity;

public class CustomerEntity {

  private String dni;
  private String name;
  private String email;

  public CustomerEntity() {
  }

  public CustomerEntity(String dni, String name, String email) {
    this.dni = dni;
    this.name = name;
    this.email = email;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "{" +
        "\"dni\": \"" + dni + "\"," +
        "\"name\": \"" + name + "\"" +
        "\"email\": \"" + email + "\"" +
        "}";
  }
}