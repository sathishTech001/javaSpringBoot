package com.crud.service;

import java.util.List;
import java.util.Optional;

import com.crud.model.Customer;

public interface CustomerService {
	Customer addCustomer(Customer data);
	
	List<Customer> getAllCustomer();
	
	Customer updateCustomer(Customer data);
	
	void deleteCustomerById(int id);

	Customer getCustomerById(int id);

}
