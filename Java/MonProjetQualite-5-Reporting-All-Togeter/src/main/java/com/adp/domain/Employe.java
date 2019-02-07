package com.adp.domain;


 public class Employe {


    private String matricule;
   
    private String nomEtPrenom;
   
    private char grade;
	
	public Employe(String matricule, String nomEtPrenom, char grade) {
		super();
		this.matricule = matricule;
		this.nomEtPrenom = nomEtPrenom;
		this.grade = grade;
	}

}

