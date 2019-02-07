package com.adp.banque.facade;

import java.util.List;

import com.adp.banque.domain.Compte;

public interface ComptesManager {

	// CRUD : Create-Retrieve-Update-Delete

	void create(Compte c) ; // C du CRUD
	List<Compte> findAll(); // Retrieve-Read-Find-Get
	Compte findById(String num); // Un autre Read
	Compte update(Compte c); // U
	void delete(Compte c);    // D

}
