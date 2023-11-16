package com.bezkoder.spring.r2dbc.h2.model;

import jakarta.persistence.*;

@Entity
@Table(name ="PERSONS")
//exactly the same

public class Tutorial {
  @Id
  @Column(name="PERSONID")
  @JoinColumn
  @ManyToMany
  @OneToMany
  private int id;

  @Column(name="LASTNAME")
  private String lastName;
  @Column(name="FIRSTNAME")
  private String firstName;

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
