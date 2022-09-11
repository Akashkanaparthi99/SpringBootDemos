package com.productapp;

import com.productapp.model.Category;
import com.productapp.model.Product;
import com.productapp.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class SpringProductappJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappJdbcApplication.class, args);
	}

	@Autowired
	IProductService productService;
	@Override
	public void run(String... args) throws Exception {
		LocalDate date = LocalDate.of(2022,12,26);
		String category = Category.TOYS.type;
//		Product product = new Product("Lego set",800.00,category,"LEGO",date);
//		productService.addProduct(product);

//		Product product1 = new Product("Moisturiser",120.00,Category.COSMETICS.name(), "Nivea",LocalDate.of(2022, Month.DECEMBER,12));
//		productService.addProduct(product1);

		// Update Product
//		productService.updateProduct(2,300);

		// Delete product
//		productService.deleteProduct(2);
		//Get all
		//productService.getAll().forEach(System.out::println);
		// Get by category
		//productService.getByCategory("COSMETICS").forEach(System.out::println);
		// Get by Lesser price
		//productService.getByLesserPrice(500).forEach(System.out::println);
		// Get by Brand
		//productService.getByBrand("Apple").forEach(System.out::println);
		// Get by BrandName letter starting
		//productService.getByBrandStarting("N").forEach(System.out::println);
		// get by expiry date
		productService.getByExpiryDate(date).forEach(System.out::println);
		// get by ID
		//System.out.println(productService.getById(1));

	}
}
