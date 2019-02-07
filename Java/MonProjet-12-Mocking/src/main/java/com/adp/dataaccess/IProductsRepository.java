package com.adp.dataaccess;

import java.util.List;

import com.adp.domain.Product;

public interface IProductsRepository {
	// CRUD
	List<Product> findAll();

}
