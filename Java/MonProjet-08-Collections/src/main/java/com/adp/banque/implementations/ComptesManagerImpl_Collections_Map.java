package com.adp.banque.implementations;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.adp.banque.domain.Compte;
import com.adp.banque.facade.ComptesManager;

@SuppressWarnings("serial")
public class ComptesManagerImpl_Collections_Map implements ComptesManager {

	private static Map<String, Compte> data = new HashMap<String, Compte>() {
		{
			put("CC10000", new Compte("CC10000", new BigDecimal("10000")));
			put("CC20000", new Compte("CC20000", new BigDecimal("20000")));
			put("CC30000", new Compte("CC30000", new BigDecimal("30000")));
		}
	};

	@Override
	public void create(Compte c) {
		
		Compte cs = new Compte();
		
		data.put(c.getNumero(), c);
	}

	@Override
	public List<Compte> findAll() {
		return new ArrayList<>(data.values());
	}

	@Override
	public Compte findById(String num) {

		return data.get(num);
	}

	@Override
	public Compte update(Compte c) {

		return data.put(c.getNumero(), c);
	}

	@Override
	public void delete(Compte c) {
		data.remove(c.getNumero());

	}

}
