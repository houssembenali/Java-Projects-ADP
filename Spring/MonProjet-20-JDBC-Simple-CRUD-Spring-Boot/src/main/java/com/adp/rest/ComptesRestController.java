package com.adp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adp.entities.Compte;
import com.adp.repository.IComptesRepository;

@RestController
@RequestMapping("/comptes")
public class ComptesRestController {
	
	@Autowired
	private IComptesRepository repo;
	
	@GetMapping
	public List<Compte> tous() {
		return repo.findAll();
	}

}
