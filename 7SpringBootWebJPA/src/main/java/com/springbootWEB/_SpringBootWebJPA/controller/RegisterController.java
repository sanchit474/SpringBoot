package com.springbootWEB._SpringBootWebJPA.controller;

import com.springbootWEB._SpringBootWebJPA.entities.User;
import com.springbootWEB._SpringBootWebJPA.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        return "redirect:/login";
    }

    @GetMapping("/profile")
    public String profilePage(@RequestParam String name, @RequestParam String email,
                              @RequestParam String phoneNo, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("phoneNo", phoneNo);
        return "profile";
    }
}
