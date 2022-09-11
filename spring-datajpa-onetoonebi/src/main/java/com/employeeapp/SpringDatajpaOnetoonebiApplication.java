package com.employeeapp;

import com.employeeapp.model.BiAddress;
import com.employeeapp.model.BiEmployee;
import com.employeeapp.service.BiAddressServiceImpl;
import com.employeeapp.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDatajpaOnetoonebiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetoonebiApplication.class, args);
	}


	EmployeeServiceImpl employeeService;

	BiAddressServiceImpl addressService;
	@Autowired
	public void setEmployeeService(EmployeeServiceImpl employeeService) {
		this.employeeService = employeeService;
	}
	@Autowired
	public void setAddressService(BiAddressServiceImpl addressService) {
		this.addressService = addressService;
	}

	@Override
	public void run(String... args) throws Exception {
//		BiAddress address = new BiAddress("82-A-554","Baba nagar","Elluru","Andhra Pradesh",502561);
//		BiEmployee employee = new BiEmployee("Baba","Backend",address);
//		employeeService.addEmployee(employee);
//		BiEmployee employee = employeeService.getById(51);
//		employee.setName("Raju");
//		employee.setDepartment("Frontend");
//		BiAddress address = employee.getAddress();
//		address.setFlatNumber("588AD54");
//		employee.setAddress(address);
//		employeeService.updateEmployee(employee);
//		employeeService.deleteEmployee(61);
//		employeeService.getAll().forEach(System.out::println);
//		System.out.println(employeeService.getByFlatNumber("508"));
//		employeeService.getByCity("Banglore").forEach(System.out::println);
//		employeeService.getByDepartment("Developer").forEach(System.out::println);
//		employeeService.getByDeptAndCity("Developer","Banglore").forEach(System.out::println);
//		employeeService.getByState("Karnataka").forEach(System.out::println);
//		addressService.getByCity("Banglore").forEach(biAddress -> {
//			System.out.println(biAddress.getEmployee());
//				});
//		addressService.getByCity("Banglore").forEach(System.out::println);
//		System.out.println(addressService.getByEmployeeId(21));
//		addressService.getByDepartment("developer").forEach(System.out::println);
//		addressService.getByName("raju").forEach(System.out::println);
//		addressService.getByNameAndCity("ash","Karimnagar").forEach(System.out::println);
//		addressService.getByNameAndStreetName("Baba","Baba nagar").forEach(System.out::println);
	}

}
