package com.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
    private  ProductRepo repo;

    
	@Override
	public List<Product> getALLdata() {
		return repo.findAll();
	}


	@Override
	public Product getProductByName(String name) {
		Product pd = repo.findByName(name);
		if (pd!=null ) {
			return pd;
		}
		else {
			return null;
		}
	}
	
	@Override
	public Product addProduct(Product data) {
		return repo.save(data);
	}


	@Override
	public Product updateProduct(Product data) {
		return repo.save(data);
	}


	@Override
	public Product deleteProductByName(String name) {
		return repo.deleteByName(name);
	}

}
