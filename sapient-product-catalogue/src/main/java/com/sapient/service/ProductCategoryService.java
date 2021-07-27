package com.sapient.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sapient.entity.ProductCategory;

public interface ProductCategoryService {

	List<ProductCategory> findAllProdcutCategory();
}
