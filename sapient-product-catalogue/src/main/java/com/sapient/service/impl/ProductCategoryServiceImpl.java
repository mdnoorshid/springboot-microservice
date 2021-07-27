package com.sapient.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.entity.ProductCategory;
import com.sapient.repository.ProductCategoryRepo;
import com.sapient.service.ProductCategoryService;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	ProductCategoryRepo productCategoryRepo;
	
	@Override
	public List<ProductCategory> findAllProdcutCategory() {
		return productCategoryRepo.findAll();
	}

}
