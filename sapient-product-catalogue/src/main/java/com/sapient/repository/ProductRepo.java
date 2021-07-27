package com.sapient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sapient.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
    
	@Query("SELECT p FROM Product p JOIN FETCH p.color JOIN FETCH p.brand WHERE p.colorId = :colorId")
	public List<Product> findByColorId(@Param(value="colorId") Integer colorId);
	
	@Query("SELECT p FROM Product p JOIN FETCH p.color JOIN FETCH p.brand WHERE p.brandId = :brandId")
	public List<Product> findByBrandId(@Param(value="brandId") Integer brandId);
	
	public List<Product> findBySize(String size);
	

}
