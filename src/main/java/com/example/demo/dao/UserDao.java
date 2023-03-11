//package com.example.demo.dao;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.UUID;
//
//@Repository
//public class UserDao {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    public void createUser() {
//        String sql = "insert into temp(city, name) values (?, ?)";
//        String name = UUID.randomUUID().toString().substring(0, 5);
//        jdbcTemplate.update(sql, "杭州", name);
//    }
//}
