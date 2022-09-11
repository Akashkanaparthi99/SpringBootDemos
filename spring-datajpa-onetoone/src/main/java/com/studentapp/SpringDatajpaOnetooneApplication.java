package com.studentapp;

import com.studentapp.model.Address;
import com.studentapp.model.Student;
import com.studentapp.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDatajpaOnetooneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetooneApplication.class, args);
	}

	@Autowired
	private IStudentService studentService;
	@Override
	public void run(String... args) throws Exception {
//		Address address = new Address("bau","Tangana");
//		Student student = new Student("Savani","Bee",address);
//		studentService.addStudent(student);
//		Student student = studentService.getById(9);
//		student.setDepartment("Cse");
//		Address address = student.getAddress();
//		address.setState("West Bengal");
//		student.setAddress(address);
//		studentService.updateStudent(student);
//		studentService.getByCity("Karimnagar").forEach(System.out::println);
//		studentService.getByDepartment("Mec").forEach(System.out::println);
//		studentService.getByState("Andhra Pradesh").forEach(System.out::println);
//		studentService.getByDeptAndCity("Cse","West Bengal").forEach(System.out::println);
//		studentService.getByDepartmentAndAddressCity("Mec","Karimnagar").forEach(System.out::println);
//		System.out.println(studentService.getById(2));
		studentService.getAll().forEach(System.out::println);
		studentService.getByCity("Karimnagar").forEach(System.out::println);
	}
}
