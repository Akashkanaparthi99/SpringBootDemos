package com.courseapp;

import com.courseapp.model.Category;
import com.courseapp.model.Course;
import com.courseapp.model.TechStack;
import com.courseapp.model.Trainer;
import com.courseapp.service.ICourseService;
import com.courseapp.service.ITrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringDatajpaManytomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaManytomanyApplication.class, args);
	}
	@Autowired
	ITrainerService trainerService;
	@Autowired
	ICourseService courseService;

	@Override
	public void run(String... args) throws Exception {
		Trainer trainer = new Trainer("Nithin Explorer",5.0,7, TechStack.DATABASE.name(), LocalDate.of(2016,01,25));
		Trainer trainer1 = new Trainer("Sripriya",4.8,9, TechStack.FRONT_END.name(), LocalDate.of(2019,05,25));
//		trainerService.addTrainer(trainer);
//		Trainer trainer2 = new Trainer("Jinto",5.0,10, TechStack.FRONT_END.name(), LocalDate.of(2017,9,25));
//		Trainer trainer3 = new Trainer("Khalim",4.8,6, TechStack.FRONT_END.name(), LocalDate.of(2017,01,26));
		Trainer trainer4 = trainerService.getById(26);
		Trainer trainer5 = trainerService.getById(6);
		Course course = new Course("SQL in 10 days",50.00,10, Category.DATABASE.name());
		course.setTrainers(new HashSet<>(Arrays.asList(trainer4,trainer5)));
//		trainerService.addTrainer(trainer);
//		courseService.addCourse(course);
//		System.out.println(courseService.getById(15));
//		System.out.println(trainerService.getById(16));
//		courseService.deleteCourse(22);
//		courseService.getAll().forEach(System.out::println);
//		trainerService.getAll().forEach(System.out::println);

//		courseService.getAll().forEach(course1 -> {
//			System.out.println(course1.getCourseName());
//			Set<Trainer> trainers = course1.getTrainers();
//			for (Trainer train:trainers) {
//				System.out.println(train);
//			}
//		});

//		courseService.getByNameContaining("SQL").forEach(System.out::println);
//		courseService.getByCategory(Category.DATABASE.name()).forEach(System.out::println);
//		courseService.getByNameAndDuration("Sripriya",5).forEach(System.out::println);
//		courseService.getByNameAndFees("Sripriya",30000).forEach(System.out::println);
//		courseService.getByTrainer("Jinto").forEach(System.out::println);
//		courseService.getByTrainerCourseName("Nithin","SQL").forEach(System.out::println);
//		courseService.getByTrainerExperience("Khalim",6).forEach(System.out::println);
//		courseService.getByTrainerExpertise("Jinto",TechStack.FRONT_END.name()).forEach(System.out::println);
//		courseService.getByTrainerRatings("Sripriya",5).forEach(System.out::println);
//		System.out.println(courseService.getById(19));

//		trainerService.getByCourseName("FullStack").forEach(System.out::println);  // not printing
//    System.out.println(trainerService.getTrainerDetails("Nithin"));
//    trainerService.getByTechStack(TechStack.FULL_STACK.name()).forEach(System.out::println);
//    trainerService.getByCategoryRatings(Category.DATABASE.name(), 5).forEach(System.out::println);
//    trainerService.getByJoiningBetween(LocalDate.of(2020,12,30)).forEach(System.out::println);

//    trainerService.getByTrainerExperience(Category.FRONT_END.name(), 10).forEach(System.out::println);
// trainerService.getByCourseNamePrice("SQL",5000).forEach(System.out::println);
//    trainerService.getByNameDuration("WEB",90).forEach(System.out::println);



	}
}
