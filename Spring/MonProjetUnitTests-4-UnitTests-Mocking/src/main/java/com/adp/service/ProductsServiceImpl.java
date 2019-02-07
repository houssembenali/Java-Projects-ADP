package com.adp.service;

import com.adp.domain.Product;
import com.adp.repository.IProductsRepository;

public class ProductsServiceImpl implements IProductsService {

	private IProductsRepository repo ;
	
	@Override
	public double calculerMontantFacture() {
		
		// Simulons un règle de gestion qui dit que 
		// quand un client commande plus de 3 produits, on lui accorde
		// 10% de remise ...
		
		 double total = repo.findAll().
				               stream().
				               mapToDouble(Product::getPrice).
				               sum();
		
		return ((repo.findAll()).size() >=3) ? total*0.9 : total;
	}

	public IProductsRepository getRepo() {
		return repo;
	}

	public void setRepo(IProductsRepository repo) {
		this.repo = repo;
	}

}
