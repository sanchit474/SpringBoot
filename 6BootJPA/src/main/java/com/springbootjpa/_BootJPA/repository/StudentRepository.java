package com.springbootjpa._BootJPA.repository;

import com.springbootjpa._BootJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Integer>{
}
