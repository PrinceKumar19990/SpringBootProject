package com.springbootpegproject.PersonProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.springbootpegproject.PersonProject.model.Person;
import com.springbootpegproject.PersonProject.repository.PersonRepository;
@SpringBootApplication
public class PersonProjectApplication implements CommandLineRunner {
@Autowired
PersonRepository pr;
	public static void main(String[] args) {
		SpringApplication.run(PersonProjectApplication.class, args);
	}
@Override
public void run(String []args) throws Exception {
	Person p1 = new Person("Prince kumar","Haryana","kumarprince1617@gmail.com");
	Person p2 = new Person("Rahul kumar","Bulendsher","rahulkumar@gmail.com");
	pr.save(p1);
	pr.save(p2);
}
}
