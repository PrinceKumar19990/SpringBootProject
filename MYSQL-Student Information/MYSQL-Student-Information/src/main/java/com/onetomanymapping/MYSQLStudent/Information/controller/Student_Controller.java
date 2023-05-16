package com.onetomanymapping.MYSQLStudent.Information.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.onetomanymapping.MYSQLStudent.Information.model.Student;
import com.onetomanymapping.MYSQLStudent.Information.repository.Student_Repository;
import com.onetomanymapping.MYSQLStudent.Information.model.Student;
@RestController
@RequestMapping("/Student")
public class Student_Controller {
@Autowired
Student_Repository sr;
@PostMapping("/save")
public void saveName(@RequestBody Student ss) {
sr.save(ss);
}
@RequestMapping("/details")
public List<Student> getstudent() {
return sr.findAll();
}
@RequestMapping("/update/{id}/{StudentName}")
public void updateBook(@PathVariable("id")Long id,@PathVariable("StudentName")String snam) {
Student ss = sr.findById(id).get();
ss.setName(snam);
sr.save(ss);
}
@RequestMapping("/details/{id}")
public Student getById(@PathVariable("id")Long id) {
return sr.findById(id).get();
}
@RequestMapping("/delete/{id}")
public void deleteBook(@PathVariable("id")Long id) {
sr.deleteById(id);
}
}

