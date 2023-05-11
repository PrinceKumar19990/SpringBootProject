package com.springbootpegproject.PersonProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootpegproject.PersonProject.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

}
