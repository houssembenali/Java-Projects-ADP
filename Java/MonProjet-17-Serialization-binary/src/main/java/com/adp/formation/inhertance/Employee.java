package com.adp.formation.inhertance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Employee extends Person  {

	private static final long serialVersionUID = -7315697185377705656L;
	private BigDecimal salaire;
	
	private List< Qualification> qualifications = new ArrayList<Qualification>();

	public List<Qualification> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}

	public Employee() {
	}

	public Employee(BigDecimal salaire) {
		super();
		this.salaire = salaire;
	}

	public Employee(String nom, BigDecimal salaire) {
		super(nom);
		this.salaire = salaire;
	}

	public BigDecimal getSalaire() {
		return salaire;
	}

	public void setSalaire(BigDecimal salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Employee [Nom" + getNom() + " salaire=" + salaire + ", qualifications=" + qualifications + "]";
	}

	

}
