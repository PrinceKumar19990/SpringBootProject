package com.springbootpegproject.PersonProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="person_infor")
public class Person {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="person_id")
private Long id;
private String name;
private String address;
private String emailId;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public Person(String name, String address, String emailId) {
	super();
	this.name = name;
	this.address = address;
	this.emailId = emailId;
}
public Person() {
}}
