package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.crud.model.Customer;
import com.crud.service.CustomerService;
import com.crud.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
		@Autowired
		CustomerServiceImpl service;
		
		@PostMapping("/add")
		private Customer addCustomer(@RequestBody Customer data) {
			return service.addCustomer(data);
		}
		@PostMapping("/update")
		private Customer updateCustomer(@RequestBody Customer data) {
			return service.updateCustomer(data);
		}
		@GetMapping("/getall")
		private List<Customer> getAllCustomer() {
			return service.getAllCustomer();
		}
		@GetMapping("/getCustomer/{id}")
		private Customer getCustomerById(@PathVariable Integer id) {
			return service.getCustomerById(id);
		}
		@DeleteMapping("/deleteCustomer/{id}")
		private String  deleteCustomerById(@PathVariable Integer id) {
		 service.deleteCustomerById(id);
		 return "success";
		}
}
