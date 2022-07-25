package com.user.entity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.user.entity.UserEntity;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserContoller {

	
	@Autowired
	private UserService userService;


	@PostMapping("/addUser")
	public ResponseEntity<UserEntity> addData(@RequestBody UserEntity userEntity)  {
	UserEntity userEntity1=userService.addData(userEntity);
			return new ResponseEntity<>(userEntity1,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public List<UserEntity> getAll() {
		return userService.getAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<UserEntity>> getById(@PathVariable("id") Integer id) throws Exception {
		Optional<UserEntity> userEntity=userService.getById(id);
		return new ResponseEntity<>(userEntity,HttpStatus.OK);

	}
	
	@PutMapping("/update")
	public ResponseEntity<UserEntity> updateById(@RequestBody UserEntity userEntity) throws Exception {
		UserEntity userEntity1=userService.updateById(userEntity);
		return new ResponseEntity<>(userEntity1,HttpStatus.OK);
		
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
