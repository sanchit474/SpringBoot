package com.springboot._MVCThymeLoginRegistrationSDJPA.service;
import com.springboot._MVCThymeLoginRegistrationSDJPA.entity.User;
import com.springboot._MVCThymeLoginRegistrationSDJPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements  UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public boolean registerUser(User user) {

        try {
            userRepository.save(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }
}
