package com.adp.repository;

import java.util.List;

import com.adp.domain.Product;

public interface IProductsRepository {

	// CRUD

	void create(Product p); // C du CRUD
	List<Product> findAll(); // R du CRUD
	Product findById(String id); // un autre R
	Product update(Product p); // U du CRUD
	void delete(String id); // D du CRUD

}
