package com.springboot._SpringBoot_jdbc;

import com.springboot._SpringBoot_jdbc.DAO.StudentDAO;
import com.springboot._SpringBoot_jdbc.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	private final StudentDAO studentDAO;
    public Application(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
    public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Override
	public void run(String... args) {

//	 ----------- Insertion -----------
//    Student student1 = new Student(1, "Abhay", "CSE", "Noida");
//    int insertStatus = studentDAO.insert(student1);
//    System.out.println(insertStatus > 0 ? "Student inserted" : "Not inserted");
//
//    // ----------- Update -----------
//    Student updatedStudent = new Student(1, "Abhay", "CSE", "Delhi");
//    int updateStatus = studentDAO.update(updatedStudent);
//    System.out.println(updateStatus > 0 ? "Student updated" : "Not updated");
//
//    // ----------- Delete -----------
//    int deleteStatus = studentDAO.delete(1);
//    System.out.println(deleteStatus > 0 ? "Student deleted" : "Not deleted");

    // ----------- Find By ID -----------
    studentDAO.findById(1).ifPresentOrElse(
        s -> System.out.println("Found student: " + s),
        () -> System.out.println("Student not found")
    );

//    // ----------- Find All -----------
//    System.out.println("All Students:");
//    studentDAO.findAll().forEach(System.out::println);
	}
}
