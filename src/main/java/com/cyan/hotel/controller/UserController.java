package com.cyan.hotel.controller;

import com.cyan.hotel.encryption.EncryptionAES;
import com.cyan.hotel.model.User;
import com.cyan.hotel.repositoryService.UserService;
import com.cyan.hotel.requestForm.RegisterForm;
import com.cyan.hotel.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class UserController {


  final String secretKey = "SecretKey";


  @Autowired
  private UserService userService;

  @Autowired
  private UserValidator userValidator;


  @GetMapping(value = "/register")
  public String register(Model model) {
    model.addAttribute("registerForm", new RegisterForm());
    return "register";
  }

  @PostMapping(value = "/register")
  public String register(@Valid @ModelAttribute("registerForm") RegisterForm registerForm, BindingResult result, ModelMap model) {

    userValidator.validate(registerForm, result);

    if (result.hasErrors()) {
      return "register";
    }
    User newUser = new User();
    String encryptedPassword = EncryptionAES.encrypt(registerForm.getPassword(), secretKey);
    newUser.setPassword(encryptedPassword);
    newUser.setFirstName(registerForm.getFirstName());
    newUser.setLastName(registerForm.getLastName());
    newUser.setEmail(registerForm.getEmail());
    newUser.setIdentityCardNumber(registerForm.getIdentityCardNumber());
    newUser.setPhoneNumber(registerForm.getPhoneNumber());
    newUser.setUsername(registerForm.getUsername());


    userService.save(newUser);

    model.addAttribute("username", registerForm.getUsername());

    return "redirect:/login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String showLoginPage(ModelMap model) {
    return "login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {
    boolean isValidUser = userService.validateUser(name, password);
    if (!isValidUser) {
      model.put("errorMessage", "Invalid Credentials");
      return "login";
    }
    model.put("name", name);
    model.put("password", password);

    model.addAttribute("username", name);
    model.addAttribute("login", "true");

    return "home";
  }


  //    @PostMapping(value="/login")
//    public String login(@RequestAttribute("username") String username, @RequestAttribute("password") String password, ModelMap model, BindingResult result){
//        userValidator.validateLogin(result, username, password);
//        if (result.hasErrors()) {
////            model.addAttribute("errorMessage", "Invalid Credentials");
//            return "login";
//        }
//        model.addAttribute("username", username);
//        model.addAttribute("login", "true");
//
//        return "home";
//    }
  @PostMapping(value = "/")
  public String logout(ModelMap model) {
    model.addAttribute("logout", "true");
    return "home";
  }
}
