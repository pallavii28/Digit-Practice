package com.user.entity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.entity.UserEntity;
import com.user.service.UserService;


public class UserContoller {

	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public String addData(@RequestBody UserEntity userEntity) throws Exception {
		try {
			return userService.addData(userEntity);
		}catch (Exception e) {
			throw new Exception();
		}
		
	}
	
	@GetMapping("/getAll")
	public List<UserEntity> getAll() throws Exception{
		try {
		return userService.getAll();	
		}catch (Exception e) {
		throw new Exception();
		}
	}
	
	@GetMapping("/getById")
	public Optional<UserEntity> getById(@RequestParam int id) throws Exception{
		try {
		return userService.getById(id);
		}catch (Exception e) {
		throw new Exception("data not found");
		}
	}
	
	@PutMapping("/update")
	public UserEntity updateById(@RequestBody UserEntity userEntity) throws Exception {
		try {
			return userService.updateById(userEntity);
		}catch (Exception e) {
			throw new Exception();
		}
		
	}
	
	@DeleteMapping("/delete")
	public String deleteById(@RequestParam int id,UserEntity userEntity) throws Exception {
		try {
		return userService.deleteById(id,userEntity);
		}catch (Exception e) {
		throw new Exception();
		}
	}
}
