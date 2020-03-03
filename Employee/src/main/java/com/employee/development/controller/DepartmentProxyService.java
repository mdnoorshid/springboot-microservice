package com.employee.development.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("department-service") //service id of Department service
public interface DepartmentProxyService {

	@GetMapping(value = "api/department/getdepartment")
	public String getDepartment();
}
