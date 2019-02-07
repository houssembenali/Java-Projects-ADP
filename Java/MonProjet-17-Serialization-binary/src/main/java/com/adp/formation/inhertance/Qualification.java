package com.adp.formation.inhertance;

import java.io.Serializable;

public class Qualification  implements Serializable{
	
	private static final long serialVersionUID = 3015833232729457384L;
	private String nom;
	public Qualification(String nom) {
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
		return "Qualification [nom=" + nom + "]";
	}
	

}
