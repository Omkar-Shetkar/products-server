package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.products.model.Product;
import com.products.service.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsController {

	@Autowired
	private ProductsService productsService;

	@GetMapping
	public List<Product> getProducts() {
		System.out.println("ProductsController.getProducts() "+productsService.getAllProducts().size());
		return productsService.getAllProducts();
	}

	@PostMapping
	public void addProduct(@RequestBody Product product) {
		System.out.println("ProductsController.addProduct()...\n"+product);
		productsService.addProduct(product);
	}
	
	@DeleteMapping
	public void removeProduct(@RequestParam("name") String name) {
		productsService.removeProduct(name);
	}
}
