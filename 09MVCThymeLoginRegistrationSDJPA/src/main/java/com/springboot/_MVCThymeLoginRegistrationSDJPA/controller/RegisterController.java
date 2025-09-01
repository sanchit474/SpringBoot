package com.springboot._MVCThymeLoginRegistrationSDJPA.controller;


import com.springboot._MVCThymeLoginRegistrationSDJPA.entity.User;
import com.springboot._MVCThymeLoginRegistrationSDJPA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @Autowired
    private UserService userService;

    @GetMapping("/registerPage")
    public String regPage(Model model){
        model.addAttribute("user", new User());
        return "register";
    }
    @PostMapping("/registerForm")
    public String submitRegPage(@ModelAttribute("user") User user , Model model){
        boolean user1 = userService.registerUser(user);
        if(user1){
            model.addAttribute("successMsg", "user registered");

        }else{
            model.addAttribute("errorMsg", "user not registered");
        }
        return "register";
    }
}
