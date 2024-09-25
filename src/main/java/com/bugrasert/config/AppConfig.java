package com.bugrasert.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bugrasert.model.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	public List<Employee> employeeList(){
		List<Employee> employeList = new ArrayList<>();
		employeList.add(new Employee("1","Bugra","Sert"));
		employeList.add(new Employee("2","Yakup","Recber"));
		employeList.add(new Employee("3","Bilal","Çamur"));
		employeList.add(new Employee("4","Harun","Kaymazalp"));
		employeList.add(new Employee("5","Yasin","Yazıcı"));
		
		return employeList;
				
	}

}
