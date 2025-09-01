package com.springboot._MVCThymeLoginRegistrationSDJPA.repository;

import com.springboot._MVCThymeLoginRegistrationSDJPA.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailAndPassword(String email, String password);
}
