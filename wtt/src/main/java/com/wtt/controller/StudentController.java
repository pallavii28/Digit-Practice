package com.wtt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wtt.bean.Student;
import com.wtt.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addRecord")
	public String addRecord(@RequestBody final Student student) {
		return studentService.addRecord(student);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAll() {
		return studentService.getAll();
	}
	
	
	@PutMapping("/updateById")
	public Student updateById(@RequestBody Student student) {
		return studentService.updateById(student);
	}
	
	@GetMapping("/getById")
	public Optional<Student> getById(@RequestParam int id){
		return studentService.getById(id);
	}
	
	@DeleteMapping("/deletedById")
	public String deletedById(@RequestParam int id) {
		studentService.deletedById(id);
		return "Data has deleted";
	}

}
