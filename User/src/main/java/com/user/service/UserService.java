package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.user.dao.UserDao;
import com.user.entity.UserEntity;


public class UserService {

	@Autowired
	private UserDao useDao;
	

	public String addData(UserEntity userEntity) {
		useDao.save(userEntity);
		 return "add Sucessfull";
	}
	
	public List<UserEntity> getAll() {
		return useDao.findAll();
	}
	
	public Optional<UserEntity> getById(int id) throws Exception{
		Optional<UserEntity> practice = useDao.findById(id);
		if(practice.isEmpty()) {
			throw new Exception("Exception message");
		}
		else {
			return practice;
		}
	}
	
	public UserEntity updateById(UserEntity userEntity) {
		return useDao.save(userEntity);
	}
	
	public String deleteById(int id,UserEntity userEntity) {
		useDao.delete(userEntity);
		return "delete sucessfull";
		 
	}
}
