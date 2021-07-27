package com.sapient.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sapient.entity.Color;

public interface ColorService {

	List<Color> findAllColors();
	
}
