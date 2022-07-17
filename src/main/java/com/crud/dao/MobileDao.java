package com.crud.dao;

import com.crud.bean.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileDao extends JpaRepository<Mobile, Integer> {
}
