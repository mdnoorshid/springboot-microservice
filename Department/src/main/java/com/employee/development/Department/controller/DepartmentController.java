package com.employee.development.Department.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/department")
public class DepartmentController {

	@GetMapping(value = "/getdepartment")
	public String getDepartment() {
		return "test Department";
	}
	
}
