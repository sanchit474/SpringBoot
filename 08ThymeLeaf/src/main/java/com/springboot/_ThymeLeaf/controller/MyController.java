package com.springboot._ThymeLeaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {
    @GetMapping("/welcomePage")
    public String showProfile(Model model){
        String name ="Sanchit";
        model.addAttribute("name", name);
        return "welcome";
    }

    @GetMapping("/conditionalPage")
    public String openConditionalPage(Model model){
        int n1 =10;
        int n2 = 9;
        model.addAttribute("n1",n1 );
        model.addAttribute("n2",n2 );

        return "conditional";
    }
    @GetMapping("/loopingPage")
    public String loopingPages(Model model){
        List<Integer> number = List.of(1,2,3,4,5,6);
        model.addAttribute("numbers",number);
        return "looping";
    }
}
