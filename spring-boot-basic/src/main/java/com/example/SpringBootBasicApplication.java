package com.example;

import com.example.autowiring.EventDetails;
import com.example.setter.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class SpringBootBasicApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootBasicApplication.class, args);
	}
//	@Autowired
//	Employee employee;
	@Autowired
	EventDetails eventDetails;
	@Override
	public void run(String... args) throws Exception {
//		ApplicationContext context = new AnnotationConfigApplicationContext("com.example");
//		Employee employee = context.getBean("employee", Employee.class);
//		System.out.println("employee = " + employee);
		System.out.println(eventDetails.printEvent("c"));
	}

}
