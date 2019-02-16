package com.products.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.products.model.Product;

@Service
public class ProductsService {

	private List<Product> products;

	public ProductsService() {
		products = new ArrayList<>();
		products.add(new Product("Milk", "Milk description", 1.11));
		products.add(new Product("Tea", "Tea description", 4.33));
		products.add(new Product("Coffee", "Coffee description", 5.34));
	}

	public List<Product> getAllProducts() {
		return products;
	}

}
