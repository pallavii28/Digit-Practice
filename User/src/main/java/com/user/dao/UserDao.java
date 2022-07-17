package com.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.UserEntity;

public interface UserDao extends  JpaRepository<UserEntity, Integer>{

}
