package com.cyan.hotel.validator;

import com.cyan.hotel.model.User;
import com.cyan.hotel.repositoryService.UserService;
import com.cyan.hotel.requestForm.RegisterForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
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
	if (userService.existByUsername(registerForm.getUsername())) {
	  errors.rejectValue("username", "Duplicate.userForm.username");
	}
	if (userService.existByEmail(registerForm.getEmail())) {
	  errors.rejectValue("email", "Duplicate.userForm.email");
	}
  }

  public void validateLogin(Errors errors, String username, String password) {
	if (userService.findByUsername(username) == null) {
	  errors.rejectValue("username", "Validate.username");
	} else {
	  User user = userService.findByUsername(username);
	  if (!user.getPassword().equals(password)) {
		errors.rejectValue("password", "Validate.password");
	  }
	}
  }
}
