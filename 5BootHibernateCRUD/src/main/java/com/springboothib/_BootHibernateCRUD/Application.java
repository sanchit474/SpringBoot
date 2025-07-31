package com.springboothib._BootHibernateCRUD;

import com.springboothib._BootHibernateCRUD.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

		try (SessionFactory factory = cfg.buildSessionFactory();
			 Session session = factory.openSession())
		{

			session.beginTransaction();

			Student s1 = new Student("Abhay", "abhay@gmail.com", "Rajasthan");
			session.persist(s1);

			session.getTransaction().commit();
			System.out.println("Student saved with ID: " + s1.getId());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
