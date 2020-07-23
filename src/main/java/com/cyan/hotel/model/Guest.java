package com.cyan.hotel.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Guest {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @NotNull
  private String firstName;

  @NotNull
  private String lastName;

  @NotNull
  private int phoneNumber;

  @NotNull
  private String email;

  @NotNull
  private int identityCardNumber;

  @OneToMany(mappedBy = "guest")
  Set<Booking> bookings;

  public int getId() {
	return id;
  }

  public void setId(int id) {
	this.id = id;
  }

  public String getFirstName() {
	return firstName;
  }

  public void setFirstName(String firstName) {
	this.firstName = firstName;
  }

  public String getLastName() {
	return lastName;
  }

  public void setLastName(String lastName) {
	this.lastName = lastName;
  }

  public int getPhoneNumber() {
	return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
	return email;
  }

  public void setEmail(String email) {
	this.email = email;
  }

  public int getIdentityCardNumber() {
	return identityCardNumber;
  }

  public void setIdentityCardNumber(int identityCardNumber) {
	this.identityCardNumber = identityCardNumber;
  }

  public Guest() {

  }

}
