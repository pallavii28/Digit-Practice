package com.wtt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wtt.bean.Student;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer>{

}
