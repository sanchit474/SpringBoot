package com.springbootjpa._BootJPA.service;

import com.springbootjpa._BootJPA.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentServices {
    public boolean addStudentDetails(Student student);
    public boolean updateStudentDetails(Student student);

    public List<Student> getAllStudentDetail(Student student);
    public Student getStudentDetail(int id);

    public boolean deleteStudentDetail(int id);
}
