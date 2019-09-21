package com.abhijeetcode.service;

import java.util.List;

import com.abhijeetcode.entity.Employee;

public interface EmployeeService {
	 public List<Employee> retrieveEmployees();
	  
	 public Employee getEmployee(Long employeeId);
	  
	 public void saveEmployee(Employee employee);
	  
	 public void deleteEmployee(Long employeeId);
	  
	 public void updateEmployee(Employee employee);
	 
	 
	}
