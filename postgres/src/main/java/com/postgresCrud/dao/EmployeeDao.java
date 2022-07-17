package com.postgresCrud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createTable() {
        final String query = "CREATE TABLE employee(id serial primary key , name varchar(155)NOT NULL, city varchar(255))";
        int update = this.jdbcTemplate.update(query);
        System.out.println(update);
    }

    public void insertData(final String name,final String city){
        String query = "insert into employee(name,city) values(?,?)";
        int update = this.jdbcTemplate.update(query,name,city);
        System.out.println(update+"row added");
    }
    public void updatebyId(final String id){
        String query = "update employee set city = 'Bareilly' where id = 1";
        int update = this.jdbcTemplate.update(query);
        System.out.println(update);
    }
}