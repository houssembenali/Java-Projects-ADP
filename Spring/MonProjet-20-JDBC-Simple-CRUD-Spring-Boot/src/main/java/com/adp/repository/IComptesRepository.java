package com.adp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adp.entities.Compte;

public interface IComptesRepository  extends JpaRepository<Compte, String>{

}
