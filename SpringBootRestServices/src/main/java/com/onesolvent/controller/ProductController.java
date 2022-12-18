package com.onesolvent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onesolvent.entity.Product;
import com.onesolvent.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {

		return productService.saveProduct(product);

	}

	@PostMapping("/products")
	public List<Product> addProducts(@RequestBody List<Product> products) {

		return productService.saveProducts(products);

	}

	@GetMapping("/products")
	public List<Product> findProducts() {

		return productService.findAllProducts();

	}

	@GetMapping("/products/{id}")
	public Product findProductById(@PathVariable int id) {

		return productService.findProductById(id);

	}
	
	@GetMapping("/product/{name}")
	public Product findProductById(@PathVariable String name) {

		return productService.findProductByName(name);

	}

	@DeleteMapping("/product/{id}")
	public void deleteProductById(@PathVariable int id) {

		productService.deleteById(id);

	}

	@PutMapping("/products")
	public Product updateProduct(@RequestBody Product product) {

		return productService.updateProduct(product);

	}

}
