package com.springbootWEB._SpringBootWebJPA.services;

import com.springbootWEB._SpringBootWebJPA.entities.User;
import com.springbootWEB._SpringBootWebJPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices{
    @Autowired
    private UserRepository userRepository;
    @Override
    public void userRegister(User user) {
        userRepository.save(user);
    }
}
