package com.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.product.model.Product;
import com.product.repository.ProductRepo;
import com.product.service.ProductService;
import com.product.service.ProductServiceImpl;

@SpringBootApplication
public class CurdOperationProductApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(CurdOperationProductApplication.class, args);
	}

	@Autowired
	 private  ProductServiceImpl service;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		List<Product> list =  (List<Product>) service.getALLdata();
		list.stream().forEach(System.out::println);
		
		Product p1 = new Product("Watch", 1000.45);
		service.addProduct(p1);
		
		
		System.out.println(service.getProductByName("Watch"));
		
		p1.setPrice(2000.65);
		
		service.updateProduct(p1);
		
		
		 service.getALLdata().stream().forEach(System.out::println);
		
		
		
	}

}
