package com.product.service;

import java.util.List;

import com.product.model.Product;

public interface ProductService {
	
	List<Product> getALLdata();
	
	Product getProductByName(String name);
	
	Product updateProduct(Product data);
	
	Product deleteProductByName(String name);

	Product addProduct(Product data);

}
