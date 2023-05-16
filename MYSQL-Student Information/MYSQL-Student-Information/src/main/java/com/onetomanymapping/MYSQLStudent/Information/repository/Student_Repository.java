package com.onetomanymapping.MYSQLStudent.Information.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetomanymapping.MYSQLStudent.Information.model.Student;
import com.onetomanymapping.MYSQLStudent.Information.model.Student;
@Repository
public interface Student_Repository extends JpaRepository<Student,Long>{

}
