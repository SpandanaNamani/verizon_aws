package com.spandana.verizon.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spandana.verizon.model.Product;

@Repository
public interface productRepository extends JpaRepository<Product, Integer> {

	
	Optional<Product> findByProductName(String productName);
}
