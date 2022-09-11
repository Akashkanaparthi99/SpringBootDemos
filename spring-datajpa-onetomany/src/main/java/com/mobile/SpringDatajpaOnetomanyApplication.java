package com.mobile;

import com.mobile.model.*;
import com.mobile.service.IRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringDatajpaOnetomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetomanyApplication.class, args);
	}

	@Autowired
	private IRestaurantService service;
	@Override
	public void run(String... args) throws Exception {
		Item item1 = new Item("Masala Dosa", Cuisine.SOUTH_INDIAN,Category.BREAKFAST, Type.VEG,50);
		Item item2 = new Item("Onion Dosa", Cuisine.SOUTH_INDIAN,Category.BREAKFAST, Type.VEG,40);
		Item item3 = new Item("Panner Dosa", Cuisine.SOUTH_INDIAN,Category.BREAKFAST, Type.VEG,120);
		Item item4 = new Item("Chicken Dum Biryani", Cuisine.SOUTH_INDIAN,Category.MAIN_COURSE, Type.NONVEG,520);

		Set<Item> items = new HashSet<>(Arrays.asList(item1,item2,item3,item4));
		Restaurant restaurant = new Restaurant("Pista House",Type.NONVEG,"Hyderabad",4.5,items);

		service.addRestaurant(restaurant);
		service.getAll().forEach(System.out::println);
//##		service.getByItemName("Masala Dosa").forEach(System.out::println); //ERROR
//		System.out.println(service.getById(10));
//		service.getByRating(4.5).forEach(System.out::println);
//		service.getByCity("Hyderabad").forEach(System.out::println);
//		service.getByType(Type.NONVEG).forEach(System.out::println);
//		service.getByItemNameCategory("Panner Dosa",Category.BREAKFAST).forEach(System.out::println);
//		String cuisine = Cuisine.SOUTH_INDIAN.name();
//		service.getByCuisine(Cuisine.SOUTH_INDIAN).forEach(System.out::println); // ERROR
		service.getByCategory(Category.BREAKFAST.toString()).forEach(System.out::println);
	}
}
