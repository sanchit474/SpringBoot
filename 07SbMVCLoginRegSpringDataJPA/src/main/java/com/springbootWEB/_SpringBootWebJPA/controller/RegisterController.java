package com.springbootWEB._SpringBootWebJPA.controller;

import com.springbootWEB._SpringBootWebJPA.entities.User;
import com.springbootWEB._SpringBootWebJPA.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {
    @Autowired
    private UserServices userServices;

    @GetMapping("/register")
    public String showRegisterForm(Model model){
        model.addAttribute("user", new User());
        return "register";
    }
    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
       userServices.userRegister(user);
        return "login";
    }


}
