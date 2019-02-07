package com.adp.repository;

import java.util.List;

import com.adp.entities.Compte;

public interface IComptesRepository {
	
	// CRUD
	void create(Compte c);

	Compte findById(String id);
	List<Compte> findAll();
	void update (Compte c);
	void delete (Compte c);
	

}
