package com.cyan.hotel.requestForm;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class RegisterForm {

  @NotNull(message = "First name is required !")
  @NotEmpty(message = "First name is required !")
  private String firstName;

  @NotNull(message = "Last name is required !")
  @NotEmpty(message = "Last name is required !")
  private String lastName;

  @NotNull(message = "Username is required !")
  @NotEmpty(message = "Username is required !")
  @NotBlank(message = "Username is required !")
  private String username;

  @NotNull(message = "Password is required !")
  @NotEmpty(message = "Password is required !")
  private String password;

  private String passwordConfirm;

  @NotNull(message = "Email is required !")
  @NotEmpty(message = "Email is required !")
  private String email;

  @NotNull(message = "Phone number is required !")
  @NotEmpty(message = "Phone number is required !")
  private String phoneNumber;

  @NotNull(message = "Identity Card Number is required !")
  @NotEmpty(message = "Identity Card Number is required !")
  private String identityCardNumber;


  public RegisterForm() {

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

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getIdentityCardNumber() {
    return identityCardNumber;
  }

  public void setIdentityCardNumber(String identityCardNumber) {
    this.identityCardNumber = identityCardNumber;
  }

  public String getPasswordConfirm() {
    return passwordConfirm;
  }

  public void setPasswordConfirm(String passwordConfirm) {
    this.passwordConfirm = passwordConfirm;
  }
}
