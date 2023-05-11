package com.springbootproject.MySqlBookProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.MySqlBookProject.model.BookManagement;

@Repository
public interface BookMgmtRepository extends JpaRepository<BookManagement,Long>{
}
