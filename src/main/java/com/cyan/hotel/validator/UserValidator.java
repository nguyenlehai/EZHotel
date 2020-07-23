package com.cyan.hotel.validator;

import com.cyan.hotel.model.User;
import com.cyan.hotel.repositoryService.UserService;
import com.cyan.hotel.requestForm.RegisterForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

  @Autowired
  private UserService userService;

  @Override
  public boolean supports(Class<?> aClass) {
    return User.class.equals(aClass);
  }

  @Override
  public void validate(Object o, Errors errors) {
    RegisterForm registerForm = (RegisterForm) o;

    if (!registerForm.getPasswordConfirm().equals(registerForm.getPassword())) {
      errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
    }

  }

  public void validateLogin(Errors errors, String username, String password) {
    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "Cannot be empty");
    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Cannot be empty");

    if (userService.findByUsername(username) == null) {
      errors.rejectValue("username", "User does not exist");
    } else {
      User user = userService.findByUsername(username);
      if (!user.getPassword().equals(password)) {
        errors.rejectValue("password", "Password incorrect");
      }
    }
  }
}
