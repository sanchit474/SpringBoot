package com.springbootWEB._SpringBootWebJPA.repository;

import com.springbootWEB._SpringBootWebJPA.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
