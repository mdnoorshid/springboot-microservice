package com.sapient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sapient.entity.Color;
import com.sapient.service.ColorService;
@RequestMapping("/api/getallcolors")
public class ColorController {
	
	@Autowired
	ColorService colorService;
	
	@GetMapping
	public ResponseEntity<List<Color>> findAll(){
	   List<Color> colors =	colorService.findAllColors();
	   return new ResponseEntity<List<Color>>(colors,new HttpHeaders(),HttpStatus.OK);
	}

}
