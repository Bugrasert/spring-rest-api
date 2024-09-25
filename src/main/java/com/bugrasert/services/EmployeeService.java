package com.bugrasert.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.bugrasert.model.Employee;
import com.bugrasert.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public List<Employee> getAllEmployeeList(){
		return employeeRepository.getAllEmployeeList();
	}

}
