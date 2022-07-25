package com.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.user.entity.UserEntity;

@Repository
public interface UserDao extends  JpaRepository<UserEntity, Integer>{

}
