package com.sapient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sapient.entity.Product;
import com.sapient.exception.ProductException;
import com.sapient.service.ProductService;

@RequestMapping("/api/getproducts")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> products = productService.findAll();
		return new ResponseEntity<List<Product>>(products, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/bycolor/{colorid}")
	public ResponseEntity<List<Product>> findByColor(@PathVariable("colorid") Integer colorId) {
		List<Product> products = productService.findByColorId(colorId);
		if (products != null || products.isEmpty())
			throw new ProductException("Product not found!!");

		return new ResponseEntity<List<Product>>(products, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/bybrand/{brandid}")
	public ResponseEntity<List<Product>> findByBrand(@PathVariable("brandid") Integer brandId){
		List<Product> products  = productService.findByBrandId(brandId);
		if(products !=null || products.isEmpty())
			throw new ProductException("Product not found!!");
		
		return new ResponseEntity<List<Product>>(products,new HttpHeaders(),HttpStatus.OK); 
	}

}
