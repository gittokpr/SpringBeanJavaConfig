package com.finalHandson.SpringBeanJavaConfig.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.finalHandson.SpringBeanJavaConfig.config.Address;
import com.finalHandson.SpringBeanJavaConfig.config.Details;

@Configuration
public class ApplicationConfig {

	@Bean(name = "details")
	@Scope("singleton")
	public Details getDetails() {
		Details details = new Details();
		details.setName("Gitto");
		details.setAge(24);
		details.setAddress(getAddress());
		return details;
	}
	@Bean(name = "address")
	@Scope("prototype")
	public Address getAddress() {
		return new Address("houseName","Kottayam","Kerala",669208);
	}
}
