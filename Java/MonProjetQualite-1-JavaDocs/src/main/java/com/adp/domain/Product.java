package com.adp.domain;

import java.math.BigDecimal;
/**
 * Classe métier décrivant un produit.
 * 
 * @author Mohamed Romdhani
 * 
 * @version 1.0
 * 
 */
public class Product {
	
	/**
	 * Id du produit
	 */
	private String id;
	
	/**
	 * Titre du produit
	 */
	private String title;
	
	/**
	 * Prix Unitaire
	 */
	private BigDecimal unitPrice;
	
	/**
	 * Constructeur par défaut
	 */
	public Product() {
	}

	/**
	 *  Constructeur d'un produit
	 * @param id  Id du produit
	 * @param title Titre du produit
	 * @param unitPrice  Prix Unitaire
	 */
	public Product(String id, String title, BigDecimal unitPrice) {
		super();
		this.id = id;
		this.title = title;
		this.unitPrice = unitPrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", unitPrice=" + unitPrice + "]";
	}
	
	

}
