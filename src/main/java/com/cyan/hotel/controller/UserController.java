package com.cyan.hotel.controller;

import com.cyan.hotel.encryption.EncryptionAES;
import com.cyan.hotel.model.User;
import com.cyan.hotel.repositoryService.UserService;
import com.cyan.hotel.requestForm.LoginForm;
import com.cyan.hotel.requestForm.RegisterForm;
import com.cyan.hotel.validator.InputValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class UserController {
    final String secretKey = "SecretKey";

    @Autowired
    private UserService userService;

    @Autowired
    private InputValidator inputValidator;

    @GetMapping(value = "/register")
    public String register(Model model) {
        model.addAttribute("registerForm", new RegisterForm());
        return "register";
    }

    @PostMapping(value = "/register")
    public String register(@Valid @ModelAttribute("registerForm") RegisterForm registerForm, BindingResult result, ModelMap model) {
        inputValidator.validate(registerForm, result);

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

        return "redirect:/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showLoginPage(@Valid @ModelAttribute("loginForm") LoginForm loginForm,
                                ModelMap model, BindingResult result, HttpSession session) {
        String encryptPassword = EncryptionAES.encrypt(loginForm.getPassword(), secretKey);

        inputValidator.validateUserLogin(result, loginForm.getUsername(), encryptPassword);
        if (result.hasErrors()) {
            return "login";
        }
        model.addAttribute("username", loginForm.getUsername());
        model.addAttribute("login", "true");
        session.setAttribute("login", "true");
        return "home";
    }

    @GetMapping(value = "/home")
    public String home() {
        return "home";
    }

    @GetMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/home";
    }
}
