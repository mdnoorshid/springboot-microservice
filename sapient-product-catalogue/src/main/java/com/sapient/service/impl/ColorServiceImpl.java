package com.sapient.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.entity.Color;
import com.sapient.repository.ColorRepo;
import com.sapient.service.ColorService;

@Service
public class ColorServiceImpl implements ColorService {

	@Autowired
	ColorRepo colorRepo;

	@Override
	public List<Color> findAllColors() {
		return colorRepo.findAll();
	}
}
