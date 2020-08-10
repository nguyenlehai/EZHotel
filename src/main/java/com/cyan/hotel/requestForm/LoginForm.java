package com.cyan.hotel.requestForm;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LoginForm {
  @NotEmpty(message = "Username is required !")
  private String username;

  @NotNull(message = "Password is required !")
  private String password;

  public LoginForm() {
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
}
