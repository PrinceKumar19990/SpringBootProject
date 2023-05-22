package com.employeemangement.EmployeeManagement.AwSB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemangement.EmployeeManagement.AwSB.model.Employee;
import com.employeemangement.EmployeeManagement.AwSB.repository.EmployeeRepository;

@CrossOrigin(origins="http://localhost:8080")
@RestController
@RequestMapping("/api/v1") 
public class EmployeeController {
@Autowired
private EmployeeRepository er;

@GetMapping("/employees")
public List<Employee> getEmployee(){
	return er.findAll();
}
@PostMapping("/employees")
public void saveEmployee(@RequestBody Employee emp) {
this.er.save(emp);	
}

}
