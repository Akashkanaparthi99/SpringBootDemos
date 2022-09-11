package com.productapp;


import com.productapp.model.Category;
import com.productapp.model.Product;
import com.productapp.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringProductappDatajpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappDatajpaApplication.class, args);
	}

	@Autowired
	IProductService productService;
	@Override
	public void run(String... args) throws Exception {
//		Product product = new Product("Foundation",5200.0, Category.COSMETICS,"Kylie", LocalDate.parse("2024-05-12"));
//		productService.addProduct(product);
//		productService.getAll().forEach(System.out::println);
//		System.out.println(productService.getById(51));
//		productService.deleteProduct(52);
//		Product product1 = productService.getById(51);
//		product1.setName("LipiSticku");
//		product1.setPrice(5555000.0);
//		productService.updateProduct(product1);

//		productService.getByBrandStarting("N").forEach(System.out::println);
//		productService.getByCategory(Category.COSMETICS).forEach(System.out::println);
//		productService.getByLesserPrice(5000).forEach(System.out::println);
//		productService.getByBrand("Kylie").forEach(System.out::println);
//		productService.getByExpiryDate(LocalDate.of(2025,02,14)).forEach(System.out::println);
//		productService.getByNewBrands("Kylie").forEach(System.out::println);
//		productService.getByNewBrandshow("Nivea",1000).forEach(System.out::println);
//		productService.getByCatExp(Category.COSMETICS,LocalDate.of(2024,12,10)).forEach(System.out::println);
//		productService.getByBrandExpiry("Nivea",LocalDate.of(2024,07,23)).forEach(System.out::println);
//		productService.getByCatBrand(Category.COSMETICS,"Kylie").forEach(System.out::println);
//		productService.getByBrandExpiry("Nivea",LocalDate.of(2024,10,01)).forEach(System.out::println);
//		productService.findByBetweenPrice(150,1500).forEach(System.out::println);
//		productService.updateProductCost(50,200);
	}
}
