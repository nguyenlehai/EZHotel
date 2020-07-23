package com.cyan.hotel.requestForm;

import javax.validation.constraints.*;

public class RegisterForm {

  @NotNull(message = "First name is required !")
  @NotEmpty(message = "First name is required !")
  @Size(max = 256, message = "First name too long")
  private String firstName;

  @NotNull(message = "Last name is required !")
  @NotEmpty(message = "Last name is required !")
  @Size(max = 256, message = "Last name too long")
  private String lastName;

  @NotNull(message = "Username is required !")
  @NotEmpty(message = "Username is required !")
  @Size(min = 6, max = 256 , message = "Username is between 6 and 256 characters ")
  private String username;

  @NotNull(message = "Password is required !")
  @NotEmpty(message = "Password is required !")
  @Size(min = 6, max = 256 , message = "Password is between 6 and 256 characters ")
  private String password;

  private String passwordConfirm;


  @Pattern(regexp = "^[0-9?A-z0-9?]+(\\.)?[0-9?A-z0-9?]+@[A-z]+\\.[A-z]{3}.?[A-z]{0,3}$", message = "Email's format is not true")
  private String email;


  @Pattern(regexp = "(03|07|08|09|01[2|6|8|9])+([0-9]{8})\\b", message = "Phone number's format is not true ")
  private String phoneNumber;


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
