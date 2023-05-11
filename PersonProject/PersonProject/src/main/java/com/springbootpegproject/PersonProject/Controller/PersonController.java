package com.springbootpegproject.PersonProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootpegproject.PersonProject.model.Person;
import com.springbootpegproject.PersonProject.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {
@Autowired
PersonRepository pr;
@RequestMapping("/details")
public List<Person> getDetails(){
	return pr.findAll();
}
}
