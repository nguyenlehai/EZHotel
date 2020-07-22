package com.cyan.hotel.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

// TODO: JOINED ? TABLE_PER_CLASS
@Entity

@Inheritance(strategy = InheritanceType.JOINED)
public class User {
  // TODO: IDENTITY ? TABLE
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  private String firstName;

  @NotNull
  private String lastName;

  @NotNull
  private String username;

  @NotNull
  private String password;

  @Transient
  private String passwordConfirm;

  @NotNull
  private int phoneNumber;

  @NotNull
  private String email;

  @NotNull
  private int identityCardNumber;


  @ManyToMany
  Set<Event> events;

  @OneToMany(mappedBy = "user")
  Set<Booking> bookings;

  public User() {

  }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

  public String getUsername() {
	return username;
  }

  public String getPassword() {
	return password;
  }

  public void setLastName(String lastName) {
	this.lastName = lastName;
  }

  public void setUsername(String username) {
	this.username = username;
  }

  public void setPassword(String password) {
	this.password = password;
  }

  public String getPasswordConfirm() {
	return passwordConfirm;
  }

  public void setPasswordConfirm(String passwordConfirm) {
	this.passwordConfirm = passwordConfirm;
  }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
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
}
