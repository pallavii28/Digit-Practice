package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.user.dao.UserDao;
import com.user.entity.UserEntity;

@Service
public class UserService {

	@Autowired
	private UserDao useDao;
	

	public UserEntity addData(UserEntity userEntity) {
		return useDao.save(userEntity);
	}
	
	public List<UserEntity> getAll() {
		return useDao.findAll();
	}
	
	public Optional<UserEntity> getById(int id) throws Exception{
		Optional<UserEntity> userEntity = useDao.findById(id);
		if(userEntity==null) {
			throw new Exception("Exception message");
		}
		else {
			return userEntity;
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
