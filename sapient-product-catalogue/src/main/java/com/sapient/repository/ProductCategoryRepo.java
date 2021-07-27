package com.sapient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.entity.ProductCategory;

@Repository
public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Integer> {

}
