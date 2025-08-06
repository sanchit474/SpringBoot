package com.springboot._MVCThymeLoginRegistrationSDJPA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/loginPage")
    public String loginPage() {
        return "login";  // ensure login.html exists in templates folder
    }
}
