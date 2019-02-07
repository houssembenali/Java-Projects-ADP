package com.adp.domain;

import java.math.BigDecimal;

public class Product {

   public String Id;
   private String title;
	private BigDecimal unitPrice;	
	
	public Product() {
	}
	
	public Product(String id, String title, BigDecimal unitPrice) {
		super();
		this.Id = id;
		this.title = title;
		this.unitPrice = unitPrice;
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
		return "Product [id=" + Id + ", title=" + title + ", unitPrice=" + unitPrice + "]";
	}
	
	

}
