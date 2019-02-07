package com.adp.banque.implementations;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.adp.banque.domain.Compte;
import com.adp.banque.domain.CompteEpargne;
import com.adp.banque.facade.ComptesManager;

public  class ComptesManagerImpl_Collections_List 
         implements ComptesManager {
	
	private static List<Compte> data = new ArrayList<>(Arrays.asList(
	   
		new Compte("C1000", new BigDecimal("1000")),
	    new Compte("C2000", new BigDecimal("2000")),
	    new CompteEpargne("E3000", new BigDecimal("3000"), new BigDecimal("0.1")),
	    new CompteEpargne("E4000", new BigDecimal("4000"), new BigDecimal("0.1"))
   ));

	@Override
	public void create(Compte c) {
		data.add(c);
		
	}

	@Override
	public List<Compte> findAll() {		
		
		return data;
	}

	@Override
	public Compte findById(String num) {
		
		
//		 for (Compte compte : data) {
//			if (compte.getNumero().equals(num))
//				return compte;
//		}
		
//		Predicate<Compte> filtre = t -> t.getNumero().equals(num);
//		
//		
//		ICalcul add = (a, b) ->  a + b;
//		ICalcul diviser = (a, b) ->  a / b;
		
//		
//		System.out.println(add(22,22));
//		
//		List<Compte> = data.stream().filter();
//		
		Compte resultat = data.
				stream().
					filter(p -> p.getNumero().equals(num)).
					findFirst().
					orElse(null);
		
		return resultat;
	}

	@Override
	public Compte update(Compte c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Compte c) {
		// TODO Auto-generated method stub
		
	}
	
}
           