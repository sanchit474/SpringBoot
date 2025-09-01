package com.springboot._MVCThymeLoginRegistrationSDJPA.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutController {
    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        HttpSession session =request.getSession();
       if( session != null )session.invalidate();
       return "redirect:/loginPage";
    }
}
