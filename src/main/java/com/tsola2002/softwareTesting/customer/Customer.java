package com.tsola2002.softwareTesting.customer;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
  @Id
  private UUID id;


  private String name;
  private String phoneNumber;

  public Customer() {
  }

  public Customer(UUID id, String name, String phoneNumber) {
    this.id = id;
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
