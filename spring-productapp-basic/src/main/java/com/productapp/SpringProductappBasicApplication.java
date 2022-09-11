package com.productapp;

import com.productapp.model.Product;
import com.productapp.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProductappBasicApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SpringProductappBasicApplication.class, args);
	}
	@Autowired
	IProductService productService;


	@Override
	public void run(String... args) throws Exception {
		productService.getAll().forEach(System.out::println);
	}
}
