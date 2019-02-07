package com.adp.client;

import com.adp.repository.ComptesRepositoryImpl_JDBC;
import com.adp.repository.IComptesRepository;

public class DemoJDBC_Simple {


	public static void main(String[] args) {

		IComptesRepository repository = new ComptesRepositoryImpl_JDBC();
		repository.findAll().forEach(System.out::println);
	
	}

}
