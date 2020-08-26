package com.stockchart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockchart.entity.Director;

@Repository
public interface DirectorDao extends JpaRepository<Director, Integer>{

}
