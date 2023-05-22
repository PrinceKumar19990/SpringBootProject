package com.employeemangement.EmployeeManagement.AwSB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeemangement.EmployeeManagement.AwSB.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
