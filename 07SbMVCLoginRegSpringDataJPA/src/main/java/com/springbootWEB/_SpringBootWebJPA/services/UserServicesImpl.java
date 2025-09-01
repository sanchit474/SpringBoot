package com.springbootWEB._SpringBootWebJPA.services;

import com.springbootWEB._SpringBootWebJPA.entities.User;
import com.springbootWEB._SpringBootWebJPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserServicesImpl implements UserServices{
    @Autowired
    private UserRepository userRepository;
    @Override
    public void userRegister(User user) {
        userRepository.save(user);
    }

    @Override
    public User userLogin(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password)
                .orElse(null); // handle not-found case
    }

    public boolean validateUser(String id, String password){
        return id.equalsIgnoreCase("admin")&&password.equalsIgnoreCase("password");
    }


//    @Override
//    public User userLogin(String email, String password) {
//       User validUser = userRepository.findByEmailAndPassword(email, password);
//       if(validUser != null && validUser.getPassword().equals(password)){
//           return validUser;
//       }
//       return null;
//    }
}
