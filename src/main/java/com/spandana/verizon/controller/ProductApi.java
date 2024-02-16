package com.spandana.verizon.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spandana.verizon.model.Product;
import com.spandana.verizon.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductApi {
   
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public Iterable<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@GetMapping("/{productId}")
	public Optional<Product> getProduct(@PathVariable int productId) {
		return productService.getProduct(productId);
	}
	
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
	@DeleteMapping("/{productId}")
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	public void deleteProduct(@PathVariable int productId) {
		productService.deleteProduct(productId);
	}
	
	
}
