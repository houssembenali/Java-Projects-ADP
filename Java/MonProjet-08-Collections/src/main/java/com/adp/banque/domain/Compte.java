package com.adp.banque.domain;

import java.math.BigDecimal;

public class Compte  { // Pascal casing pour les types

	private String numero; // Camel casing pour les attributs
	private BigDecimal solde;

	 public Compte() {
	    super();
	 }

	public Compte(String numero, BigDecimal solde) {
		this.numero = numero;
		this.solde = solde;
	}

	public String getNumero() {
		return numero;
	}

	public BigDecimal getSolde() {
		return solde;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setSolde(BigDecimal solde) {
		this.solde = solde;
	}


	public void débiter(BigDecimal quantite) {
		solde = solde.subtract(quantite);
	}


	public void créditer(BigDecimal quantite) {
		solde = solde.add(quantite);
	}


	public  BigDecimal consulterSolde() {
		return this.solde;
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + "]";
	}

}