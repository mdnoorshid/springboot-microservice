package com.employee.development.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.development.dao.IEmployeeRepo;
import com.employee.development.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	IEmployeeRepo iEmployeeRepo;

	public List<Employee> getAllEmployees() {
        List<Employee> empList = new ArrayList<Employee>();
        iEmployeeRepo.findAll().forEach(empList::add);
        return empList;
	}
	
	public Employee addEmployee(Employee employee) {
		return iEmployeeRepo.save(employee);
	}
	
	public Employee getEmployee(Integer id) {
		return iEmployeeRepo.findById(id).get();
	}

}
