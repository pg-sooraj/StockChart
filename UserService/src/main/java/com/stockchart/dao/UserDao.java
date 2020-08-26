package com.stockchart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockchart.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

}
