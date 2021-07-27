package com.sapient.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.entity.Product;
import com.sapient.repository.ProductRepo;
import com.sapient.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepo productRepo;

	@Override
	public List<Product> findAll() {
		return productRepo.findAll();
	}

	@Override
	public List<Product> findByColorId(Integer colorId) {
		return productRepo.findByColorId(colorId);
	}

	@Override
	public List<Product> findByBrandId(Integer brandId) {
		return findByBrandId(brandId);
	}



}
