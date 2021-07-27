package com.sapient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.entity.ProductCategory;
import com.sapient.service.ProductCategoryService;

@RestController
@RequestMapping("/api/producategories")
public class ProductCategoryController {
	
	@Autowired
	ProductCategoryService productCategoryService;
	
	@GetMapping
	public ResponseEntity<List<ProductCategory>> findAll(){
	 List<ProductCategory> productCategories = 	productCategoryService.findAllProdcutCategory();
	 return new ResponseEntity<List<ProductCategory>>(productCategories,new HttpHeaders(),HttpStatus.OK);
	}

}
