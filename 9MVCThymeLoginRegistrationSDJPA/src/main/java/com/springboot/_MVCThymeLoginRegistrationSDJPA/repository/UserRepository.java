package com.springboot._MVCThymeLoginRegistrationSDJPA.repository;

import com.springboot._MVCThymeLoginRegistrationSDJPA.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
