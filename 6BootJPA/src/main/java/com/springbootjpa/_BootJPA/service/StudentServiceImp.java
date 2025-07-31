package com.springbootjpa._BootJPA.service;

import com.springbootjpa._BootJPA.entity.Student;
import com.springbootjpa._BootJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentServices {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public boolean addStudentDetails(Student student) {
        boolean status = false;
        try {
            studentRepository.save(student);
            status = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public boolean updateStudentDetails(Student student) {
        boolean status = false;
        try{
            studentRepository.save(student);
            status = true;
        }catch (Exception e){
            e.printStackTrace();
            status = false;
        }
        return status;
    }

    @Override
    public List<Student> getAllStudentDetail(Student student) {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentDetail(int id) {
        Optional<Student> optional = studentRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @Override
    public boolean deleteStudentDetail(int id) {
        boolean status = false;
         try{
             studentRepository.deleteById(id);
             status = true;
         }catch (Exception e){
             e.printStackTrace();
             status = false;
         }
        return status;
    }
}
