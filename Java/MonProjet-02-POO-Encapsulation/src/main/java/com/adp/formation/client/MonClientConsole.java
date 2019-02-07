package com.adp.formation.client;

import java.math.BigDecimal;

import com.adp.formation.domain.Compte;

public class MonClientConsole 
{
    public static void main(String[] args) {
    	
    	// Instancier un compte
    	Compte compte = new Compte("C100", BigDecimal.TEN);
    	
    	
    	
    	// Utiliser ce compte
    	compte.créditer(new BigDecimal("1000.5"));
    	
    	System.out.println(compte);
    	
    	compte = null;
		
	}
}
