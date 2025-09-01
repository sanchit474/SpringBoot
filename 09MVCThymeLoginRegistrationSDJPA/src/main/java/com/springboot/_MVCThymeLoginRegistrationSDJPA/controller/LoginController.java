package com.springboot._MVCThymeLoginRegistrationSDJPA.controller;

import com.springboot._MVCThymeLoginRegistrationSDJPA.entity.User;
import com.springboot._MVCThymeLoginRegistrationSDJPA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/loginPage")
    public String openLoginPage(Model model) {
        model.addAttribute("user", new User());
        return "login";  // ensure login.html exists in templates folder
    }
    @Autowired
    UserService userService;
    @PostMapping("/loginForm")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        Model model) {

        User user = userService.userLogin(email, password);

        if (user != null) {
            model.addAttribute("userName", user.getName()); // pass data to welcome/profile
            return "profile";  // maps to profile page
        } else {
            model.addAttribute("error", "Invalid email or password!");
            return "redirect:/loginPage";
        }
    }
}
