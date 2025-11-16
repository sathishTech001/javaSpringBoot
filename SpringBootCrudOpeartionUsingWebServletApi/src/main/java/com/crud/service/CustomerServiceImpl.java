package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Customer;
import com.crud.repository.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository custRepo;

	@Override
	public Customer addCustomer(Customer data) {
		return custRepo.save(data);
	}

//	@Override
//	public Customer getCustomerByName(String name) {
//		return custRepo.findByCustomerName(name);
//	}

	@Override
	public List<Customer> getAllCustomer() {
		return custRepo.findAll();
	}

	@Override
	public Customer updateCustomer(Customer data) {
		return custRepo.save(data);
	}

	@Override
	public void deleteCustomerById(int id) {
		custRepo.deleteById(id);
	}

	@Override
	public Customer getCustomerById(int id) {
		return  custRepo.findById(id).orElse(null);
	}


}
