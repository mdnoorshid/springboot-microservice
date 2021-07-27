package com.sapient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.entity.Color;

@Repository
public interface ColorRepo extends JpaRepository<Color,Integer> {

}
