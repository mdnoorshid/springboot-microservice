package com.employee.development.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.development.entity.Employee;
import com.employee.development.service.EmployeeService;

@RestController
@RequestMapping(value = "api/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	DepartmentProxyService departmentService;

	@GetMapping(value = "/getallemployees")
	public List<Employee> getEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@PostMapping(value = "/createemployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping(value = "/getemployee/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) {
		Employee emp =  employeeService.getEmployee(id);
		emp.setDepId(departmentService.getDepartment());
		return emp;
	}
	
}
