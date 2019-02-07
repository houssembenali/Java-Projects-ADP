package com.adp.domain;

import org.springframework.stereotype.Component;

@Component
public class Calcul {
	
	public void additionner(int a, int b) {
		//System.out.println("LOG : A l'entrée de Additionner");
		int resultat = a+b;
		System.out.println("La somme est : "+ resultat);
	//	System.out.println("LOG : A la sortie de Additionner");
	}

}
