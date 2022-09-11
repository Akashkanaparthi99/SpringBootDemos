package com.furnapp;

import com.furnapp.model.*;
import com.furnapp.service.IFurnitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFurnappDatajpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringFurnappDatajpaApplication.class, args);
	}

	@Autowired
	IFurnitureService furnitureService;
	@Override
	public void run(String... args) throws Exception {
//		Furniture furniture = new Furniture("4 Seater Sofa", Category.SOFA.name(), RoomType.LIVING.room, Material.TWOOD.type,"Wood Ink", Style.MODERN,25020.0,false);
//		furnitureService.addFurniture(furniture);
//		furnitureService.findByStyle(Style.MODERN).forEach(System.out::println);
//		furnitureService.findByBrand("Wood Ink").forEach(System.out::println);
//		furnitureService.findByCategory("SOFA").forEach(System.out::println);
//		furnitureService.findByMaterial("TEAK WOOD").forEach(System.out::println);
//		System.out.println(furnitureService.findTotal());
//		furnitureService.findByRoomType("Living Room").forEach(System.out::println);
//		furnitureService.findByStorageAvailable(true).forEach(System.out::println);  // not printing
//		furnitureService.findByPriceRange(10000,30000).forEach(System.out::println);
//		furnitureService.findByMatAndBrand("TEAK WOOD","Wood Ink").forEach(System.out::println);
//		furnitureService.findByRoomAndCategory("Living Room","SOFA").forEach(System.out::println); // not printing
//		System.out.println(furnitureService.getById(2396)); //could not initialize proxy
	}
}
