package com.adp.domain;

import com.adp.exceptions.AgeInvalideException;

public class Employe {
	
	private String nom;
	private int age;
	
	public Employe(String nom, int age)  throws AgeInvalideException{
		super();
		this.nom = nom;
		if ((age <=0) ||(age >= 120)) {
			throw new AgeInvalideException("L'age "+ age+ " doit entre entre 0-100");
		}  else {
			this.age = age;
		}
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", age=" + age + "]";
	}
	
	
	
	

}
