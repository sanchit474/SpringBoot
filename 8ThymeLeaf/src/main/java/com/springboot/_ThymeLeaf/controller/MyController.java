package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/welcomePage")
    public String showProfile(Model model){
        String name ="Sanchit";
        model.addAttribute("name", name);
        return "welcome";
    }
}
