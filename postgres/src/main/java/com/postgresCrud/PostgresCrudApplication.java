package com.postgresCrud;

import com.postgresCrud.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostgresCrudApplication implements CommandLineRunner {
@Autowired
private EmployeeDao employeeDao;

	public static void main(String[] args) {
		SpringApplication.run(PostgresCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//this.employeeDao.createTable();
		//this.employeeDao.insertData("rohit_kumar","Agra");
		this.employeeDao.updatebyId("Bareilly");
	}
}
