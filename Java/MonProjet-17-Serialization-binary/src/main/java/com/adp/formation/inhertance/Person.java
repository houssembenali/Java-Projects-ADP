package com.adp.formation.inhertance;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = 5504545593541944994L;
	// private static final long serialVersionUID = 123L ;

	private String nom;

	public Person() {
	}

	public Person(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Person [nom=" + nom + "]";
	}

}
