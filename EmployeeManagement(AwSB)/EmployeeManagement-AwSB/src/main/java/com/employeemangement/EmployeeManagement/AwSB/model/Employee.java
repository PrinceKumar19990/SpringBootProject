package com.employeemangement.EmployeeManagement.AwSB.model;
import jakarta.persistence.*;
@Entity
@Table(name="employee_info")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="employee_id")
private int id;
private String firsteName;
private String lastName;
private String emailId;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirsteName() {
	return firsteName;
}
public void setFirsteName(String firsteName) {
	this.firsteName = firsteName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public Employee(String firsteName, String lastName, String emailId) {
	super();
	this.firsteName = firsteName;
	this.lastName = lastName;
	this.emailId = emailId;
}
public Employee() {
	
}
}
