package com.sapient.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.entity.Brand;
import com.sapient.repository.BrandRepo;
import com.sapient.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	BrandRepo brandRepo;
	
	@Override
	public List<Brand> findAllBrands() {
		return brandRepo.findAll();
	}

}
