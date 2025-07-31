package com.SpringBootT._myApp_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
public class Alien {
    @Autowired    //field injection
    private laptop lp;
    public void build() {
        lp.compile();
        System.out.println("bulding something better to help the people of world");
    }
}
