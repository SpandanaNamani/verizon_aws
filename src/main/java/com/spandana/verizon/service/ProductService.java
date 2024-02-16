package com.spandana.verizon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.spandana.verizon.model.Product;
import com.spandana.verizon.repository.productRepository;

@Service
public class ProductService {
    
	@Autowired
	private productRepository productRepository;   
	
	public Iterable<Product> getAllProducts() {
		return productRepository.findAll();
		}
	
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}


	public Optional<Product> getProduct(int productId) {
		// TODO Auto-generated method stub
		return productRepository.findById(productId);
	}


	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}


	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		productRepository.deleteById(productId);
	}
}
