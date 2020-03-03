package com.employee.development.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "EmployeeManagement")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private int id;
	@Column(name = "employee_name" ,length = 20 ,nullable = false)
	private String name;
	@Column(name = "designation" , length = 20 , nullable = false)
	private String designation;
    @JsonIgnore
	@Transient
	private String depId;
	
	public Employee() {}
	
	public Employee(int id, String name, String designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepId() {
		return depId;
	}
	public void setDepId(String depId) {
		this.depId = depId;
	}
	
}
