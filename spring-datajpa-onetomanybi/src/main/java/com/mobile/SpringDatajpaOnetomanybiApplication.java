package com.mobile;

import com.mobile.model.*;
import com.mobile.service.IMobileService;
import com.mobile.service.ISellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringDatajpaOnetomanybiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetomanybiApplication.class, args);
	}
	@Autowired
	IMobileService mobileService;
	@Autowired
	ISellerService sellerService;

	@Override
	public void run(String... args) throws Exception {
//		Set<Mobile> mobile = new HashSet<Mobile>(Arrays.asList(
//			new Mobile("S22 Ultra","Samsung",112999.0, Processor.EXYNOS, Memory.GB12.type, CameraType.FRONT,Os.ANDROID.name(),Storage.STORAGE512.type),
//			new Mobile("S22 ","Samsung",92999.0, Processor.EXYNOS, Memory.GB12.type, CameraType.FRONT,Os.ANDROID.name(),Storage.STORAGE512.type),
//			new Mobile("Reno 7","Oppo",42999.0, Processor.MEDIATEK, Memory.GB8.type, CameraType.FRONT,Os.ANDROID.name(),Storage.STORAGE128.type),
//			new Mobile("IPhone 13 ","Apple",82999.0, Processor.APPLE_BIONIC, Memory.GB8.type, CameraType.FRONT,Os.IOS.name(),Storage.STORAGE512.type),
//			new Mobile("IPhone 13 mini ","Apple",72999.0, Processor.APPLE_BIONIC, Memory.GB8.type, CameraType.FRONT,Os.IOS.name(),Storage.STORAGE512.type),
//			new Mobile("IPhone 13 Pro Max","Apple",122999.0, Processor.APPLE_BIONIC, Memory.GB8.type, CameraType.FRONT,Os.IOS.name(),Storage.STORAGE512.type)));
//				//new Mobile("S22 Ultra","Samsung",112999.0, Processor.EXYNOS, Memory.GB12.type, CameraType.FRONT,Os.ANDROID.name(),Storage.STORAGE512.type);
//		Seller seller = new Seller("Sangeetha Mobiles",4.6,"Hyderabad",mobile);
//		sellerService.addSeller(seller);
//		sellerService.getByMobBrand("Samsung").forEach(System.out::println);
//		sellerService.getByMobBrandPrice("Samsung",100000).forEach(System.out::println);
//		sellerService.getByCity("Hyderabad").forEach(System.out::println);

//		mobileService.getByProcessor(Processor.EXYNOS).forEach(mobile -> {
//			System.out.println(mobile.getBrand());
//			System.out.println(mobile.getSeller());
//			System.out.println(mobile.getPrice());
//		});

//		mobileService.getBySellerName("Sangeetha Mobiles").forEach(System.out::println);
//		mobileService.getBySeller("Reliance Digital","Hyderabad").forEach(System.out::println);
//		mobileService.getByBrandAndCamera("Apple",CameraType.FRONT).forEach(System.out::println);
//		mobileService.getByBrand("Oppo").forEach(System.out::println);
//		mobileService.getByCameraType(CameraType.FRONT).forEach(System.out::println);
	}
}
