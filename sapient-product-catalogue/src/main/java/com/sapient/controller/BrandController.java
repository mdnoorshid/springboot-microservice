package com.sapient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sapient.entity.Brand;
import com.sapient.service.BrandService;

@RequestMapping("/api/brands")
public class BrandController {
	
	@Autowired
	BrandService brandService;
	
	@GetMapping
	public ResponseEntity<List<Brand>> findAll(){
	List<Brand> brands=	brandService.findAllBrands();
	return new ResponseEntity<List<Brand>>(brands,new HttpHeaders(),HttpStatus.OK);
	}

}
