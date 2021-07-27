package com.sapient.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sapient.entity.Brand;

public interface BrandService {
	
	List<Brand> findAllBrands();

}
