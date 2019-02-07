package com.adp.entities;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compte {
	
	private String numero;
	private String proprietaire;
	private BigDecimal solde;
	

}
