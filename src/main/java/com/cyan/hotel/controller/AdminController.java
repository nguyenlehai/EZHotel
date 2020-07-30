package com.cyan.hotel.controller;


import com.cyan.hotel.repositoryService.AdminService;
import com.cyan.hotel.requestForm.LoginForm;
import com.cyan.hotel.validator.InputValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class AdminController {

    @Autowired
    AdminService adminService;

    @Autowired
    InputValidator inputValidator;


    @GetMapping(value = "/admin/login")
    public String adminLogin(ModelMap modelMap) {
        modelMap.addAttribute("loginAdminForm", new LoginForm());
        return "adminLogin";
    }

    @PostMapping(value = "/admin/login")
    public String adminLogin(@Valid @ModelAttribute("loginAdminForm") LoginForm loginAdminForm, ModelMap modelMap, BindingResult result, HttpSession session) {
        inputValidator.validateAdminLogin(result, loginAdminForm.getUsername(), loginAdminForm.getPassword());
        if (result.hasErrors()) {
            return "adminLogin";
        }
        modelMap.addAttribute("username", loginAdminForm.getUsername());
        session.setAttribute("adminLogin", "true");
        return "redirect:/admin/booking";
    }

    @GetMapping(value = "/admin/logout")
    public String adminLogout(HttpSession session) {
        session.invalidate();
        return "redirect:/home";
    }

}
