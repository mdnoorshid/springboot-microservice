package com.sapient.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sapient.entity.Product;

public interface ProductService {
	
	List<Product> findAll();
	List<Product> findByColorId(Integer colorId);
	List<Product> findByBrandId(Integer brandId);
}
