package com.adp.domain;

import java.math.BigDecimal;

public class Product {

	private String id;
	private BigDecimal unitPrice;

	public Product() {
	}

	public Product(String id, BigDecimal unitPrice) {
		super();
		this.id = id;
		this.unitPrice = unitPrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", unitPrice=" + unitPrice + "]";
	}

}
