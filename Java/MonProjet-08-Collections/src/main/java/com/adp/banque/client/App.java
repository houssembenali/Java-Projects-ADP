package com.adp.banque.client;

import java.math.BigDecimal;

import com.adp.banque.domain.Compte;
import com.adp.banque.domain.CompteEpargne;
import com.adp.banque.facade.ComptesManager;
import com.adp.banque.implementations.ComptesManagerImpl_Collections_Map;

public class App {
	public static void main(String[] args) {

		ComptesManager manager = new ComptesManagerImpl_Collections_Map();

		// testFindAll(manager);

		testCreate(manager);

		testFindAll(manager);

	}

	private static void testCreate(ComptesManager manager) {

		manager.create(new CompteEpargne("E5000", new BigDecimal("5000"), new BigDecimal("0.1")));

	}

	private static void testFindAll(ComptesManager manager) {
		for (Compte iter : manager.findAll()) {
			System.out.println(iter);

		}
	}
}
