package com.adp.business;

import java.math.BigDecimal;

import com.adp.repository.IComptesRepository;

public class ComptesBusinessImpl implements IComptesBusiness {

	private IComptesRepository repo;

	public IComptesRepository getRepo() {
		return repo;
	}

	public void setRepo(IComptesRepository repo) {
		this.repo = repo;
	}

	@Override
	public BigDecimal consulterSolde(String id) {
		return repo.findById(id).getSolde();
	}

}
