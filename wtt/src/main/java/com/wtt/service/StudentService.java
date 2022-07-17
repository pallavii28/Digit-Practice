package com.wtt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.wtt.bean.Student;
import com.wtt.dao.StudentDao;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public String addRecord(final Student student) {
		studentDao.save(student);
		return "Data has Inserted";
	}
	
	public List<Student> getAll() {
		return studentDao.findAll();
	}
	
	public Student updateById(Student student) {
		return studentDao.save(student);
	}
	
	
	public Optional<Student> getById(@RequestParam int id){
		return studentDao.findById(id);
	}
	
	public String deletedById(@RequestParam int id) {
		studentDao.deleteById(id);
		return "deleted data";
	}

}
