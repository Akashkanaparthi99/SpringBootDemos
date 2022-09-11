package com.furnapp;

import  com.furnapp.model.*;
import com.furnapp.service.IFurnitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFurnappJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringFurnappJdbcApplication.class, args);
	}

	@Autowired
	IFurnitureService furnitureService;
	@Override
	public void run(String... args) throws Exception {
		Furniture furniture = new Furniture("Queen size Bed", Category.BEDS, RoomType.BED.room, Material.MWOOD.type,"ZXY", Style.MODERN,85000.60,true);
		furnitureService.addFurniture(furniture);
		furnitureService.getByStyle("MODERN").forEach(System.out::println);
		furnitureService.getByBrand("Wood Ink").forEach(System.out::println);
		furnitureService.getByCategory(Category.SOFA.name()).forEach(System.out::println);
		System.out.println(furnitureService.getById(2396));
		furnitureService.getByMaterial(Material.TWOOD.type).forEach(System.out::println);
		furnitureService.getByPriceRange(20000,30000).forEach(System.out::println);
		furnitureService.getByRoomType(RoomType.LIVING.room).forEach(System.out::println);
	}
}
