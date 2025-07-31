package com.springbootjpa._BootJPA;

import com.springbootjpa._BootJPA.entity.Student;
import com.springbootjpa._BootJPA.service.StudentServiceImp;
import com.springbootjpa._BootJPA.service.StudentServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

//		ApplicationContext context = SpringApplication.run(Application.class, args);
//		StudentServices studentServices = context.getBean(StudentServiceImp.class);
////		---------------------------------- insert -----------------------------------------------
//		Student student = new Student();
//		student.setName("sanchit");
//		student.setRollno(33225);
//		student.setEmail("sanc@gmail.com");
//		boolean status = studentServices.addStudentDetails(student);
//		if(status){
//			System.out.println("inserted");
//		}else {
//			System.out.println("not");
//		}

//		---------------------------get All details----------------------------------------
//		List<Student> stdlist = studentServices.getStudentDetail(student);
//		for(Student studen : stdlist){
//			System.out.print(studen.getId() +"  ");
//			System.out.print(studen.getName()+"  ");
//			System.out.print(studen.getRollno()+"  ");
//			System.out.println(studen.getEmail());
//		}
//		---------------------------------get detail by id---------------------------------
//		Student studen	= studentServices.getStudentDetail(1);
//		if(studen != null){
//		  System.out.print(studen.getId() +"  ");
//		  System.out.print(studen.getName()+"  ");
//		  System.out.print(studen.getRollno()+"  ");
//		  System.out.println(studen.getEmail());
//	  	}else {
//			System.out.println("student not found");
//		}

//---------------------------------------------delete student by id--------------------
//		boolean del = studentServices.deleteStudentDetail(1);
//		if(del){
//			System.out.println("deleted");
//		}else{
//			System.out.println("not deleted");
//		}
	}

}
