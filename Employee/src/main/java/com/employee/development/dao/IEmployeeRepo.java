package com.employee.development.dao;

import org.springframework.data.repository.CrudRepository;

import com.employee.development.entity.Employee;

public interface IEmployeeRepo extends CrudRepository<Employee, Integer>{

}
