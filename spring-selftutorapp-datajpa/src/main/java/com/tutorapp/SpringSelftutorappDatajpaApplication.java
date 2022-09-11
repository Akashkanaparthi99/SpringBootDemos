package com.tutorapp;

import com.tutorapp.model.*;
import com.tutorapp.service.ICategoryService;
import com.tutorapp.service.ICourseService;
import com.tutorapp.service.ITrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringSelftutorappDatajpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringSelftutorappDatajpaApplication.class, args);
	}

	private ICourseService courseService;
	private ITrainerService trainerService;
	private ICategoryService categoryService;
	@Autowired
	public void setCourseService(ICourseService courseService) {
		this.courseService = courseService;
	}
	@Autowired
	public void setTrainerService(ITrainerService trainerService) {
		this.trainerService = trainerService;
	}
	@Autowired
	public void setCategoryService(ICategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@Override
	public void run(String... args) throws Exception {

//		Trainer trainer1 = new Trainer("Rahul",4.5,10, TechStack.FULLSTACK.name(), 2500);
//		Trainer trainer2 = new Trainer("Ramesh",4.5,8, TechStack.FULLSTACK.name(), 2000);
//		Trainer trainer3 = new Trainer("Vijay",4.2,5, TechStack.FULLSTACK.name(), 900);
//		Trainer trainer4 = new Trainer("Vivek",5,18, TechStack.FULLSTACK.name(), 25020);
//		trainerService.addTrainer(trainer1);
//		trainerService.addTrainer(trainer2);
//		trainerService.addTrainer(trainer3);
//		trainerService.addTrainer(trainer4);

//		Trainer trainer1 = new Trainer("Alan",4.5,13, TechStack.FRONTEND.name(), 7000);
//		Trainer trainer2 = new Trainer("Ash",4.5,8, TechStack.BACKEND.name(), 1000);
//		Trainer trainer3 = new Trainer("Jintoo",4.2,5, TechStack.CLOUD_COMPUTING.name(), 5900);
//		Trainer trainer4 = new Trainer("Karan",5,7, TechStack.DATABASE.name(), 1020);
//		trainerService.addTrainer(trainer1);
//		trainerService.addTrainer(trainer2);
//		trainerService.addTrainer(trainer3);
//		trainerService.addTrainer(trainer4);

//		SubCategory sub1 = new SubCategory("Web Development", Topic.ANGULAR.topic);
//		SubCategory sub2 = new SubCategory("FrameWorks", Topic.SPRING.topic);
//		SubCategory sub3 = new SubCategory("Programming", Topic.JAVA.topic);
//		SubCategory sub4 = new SubCategory("Data Science", Topic.PYTHON.topic);
//		Category category = new Category("Development",new HashSet<>(Arrays.asList(sub1,sub2,sub3,sub4)));
//		categoryService.addCategory(category);

//		SubCategory sub1 = new SubCategory("Advertising", Topic.PAIDAD.topic);
//		SubCategory sub2 = new SubCategory("Digital", Topic.DIGITAL.topic);
//		SubCategory sub3 = new SubCategory("Content", Topic.CONTENT.topic);
//		SubCategory sub4 = new SubCategory("Product", Topic.PRODUCT.topic);
//		Category category = new Category("Marketing",new HashSet<>(Arrays.asList(sub1,sub2,sub3,sub4)));
//		categoryService.addCategory(category);

//		courseService.deleteCourse(151);
		Features features1 = new Features("Sub-Titles");
		Features features2 = new Features("Quiz");
		Features features3 = new Features("Assignments");
		Set<Features> featuresSet = new HashSet<>(Arrays.asList(features1,features2,features3));
		CourseDetails courseDetails = new CourseDetails("English",4.3,20000,"learn Java in 10 days",4,Level.INTERMEDIATE.name(),featuresSet);
	}
}
