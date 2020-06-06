package com.subrutin.halospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Employee employee() {
		Employee employee = new Employee();
		employee.setId("2");
		employee.setFullName("silvie");
		employee.setAddress("Jalan Merdeka");
		return employee;
		
	}
}
