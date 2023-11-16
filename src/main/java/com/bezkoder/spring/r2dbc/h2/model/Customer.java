package com.bezkoder.spring.r2dbc.h2.model;

import jakarta.persistence.*;

@Entity
@Table(name ="CUSTOMERS")
//exactly the same

public class Customer {
  @Id
  @Column(name="PHONENUMBER_ID")
  @JoinColumn
  @ManyToMany
  @OneToMany
  private int id;

  @Column(name="CUSTOMER_STREET")
  private String customerStreet;
  
  @Column(name="CUSTOMER_ZIPCODE")
  private String customerZipCode;

  @Column(name="ADDRESS")
  private String addresse;

  @Column(name="CITY")
  private String city;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getAddress() {
    return addresse;
  }

  public void setAddress(String address) {
    this.addresse = addresse;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
