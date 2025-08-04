package com.springbootWEB._SpringBootWebJPA.controller;

import com.springbootWEB._SpringBootWebJPA.entities.User;
import com.springbootWEB._SpringBootWebJPA.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class LoginController {
    @Autowired
    UserServices userServices;

    @GetMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        Model model) {

        User user = userServices.userLogin(email, password);

        if (user != null) {
            model.addAttribute("user", user); // pass data to welcome.jsp
            return "welcome";  // maps to /WEB-INF/views/welcome.jsp
        } else {
            model.addAttribute("error", "Invalid email or password!");
            return "login";
        }
    }
}
