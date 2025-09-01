package com.springbootWEB._SpringBootWebJPA.services;

import com.springbootWEB._SpringBootWebJPA.entities.User;

public interface UserServices {
    public void userRegister(User user);
    public  User userLogin(String email, String password);
}
