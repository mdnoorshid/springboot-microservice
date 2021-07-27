package com.sapient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.entity.Brand;

@Repository
public interface BrandRepo extends JpaRepository<Brand, Integer> {

}
