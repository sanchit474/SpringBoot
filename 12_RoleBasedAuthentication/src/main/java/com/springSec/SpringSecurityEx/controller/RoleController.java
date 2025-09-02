package com.springSec.SpringSecurityEx.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Public: anyone can access!";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String userEndpoint() {
        return "Hello USER!";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Hello ADMIN!";
    }

    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @GetMapping("/common")
    public String commonEndpoint() {
        return "Hello USER or ADMIN!";
    }
}
