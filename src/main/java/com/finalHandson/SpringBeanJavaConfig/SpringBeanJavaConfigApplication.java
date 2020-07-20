package com.finalHandson.SpringBeanJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.finalHandson.SpringBeanJavaConfig.config.Address;
import com.finalHandson.SpringBeanJavaConfig.config.Details;
import com.finalHandson.SpringBeanJavaConfig.model.ApplicationConfig;

public class SpringBeanJavaConfigApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Details details = (Details) context.getBean("details");
		Address address = (Address) context.getBean("address");
		System.out.println("Details: " + details.toString());
		System.out.println("Address: " + address.toString());
	}

}
