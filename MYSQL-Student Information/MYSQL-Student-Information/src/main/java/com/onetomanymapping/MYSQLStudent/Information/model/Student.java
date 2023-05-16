package com.onetomanymapping.MYSQLStudent.Information.model;

import jakarta.persistence.*;
@Entity
@Table(name="student_inf")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="student_rollno")
private int id;
private String cityname;
private String name;
private Long rollno;


public String getCityname() {
	return cityname;
}

public void setCityname(String cityname) {
	this.cityname = cityname;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Long getRollno() {
	return rollno;
}

public void setRollno(Long rollno) {
	this.rollno = rollno;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public Student(String cityname, String name, Long rollno) {
	super();
	this.cityname = cityname;
	this.name = name;
	this.rollno = rollno;
}
public Student() {
}
}