package com.adp.nouveautes_java_5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo_Generics {
	public static void main(String[] args) {

		Illustation_Collections_NON_Génériques();
		Illustation_Collections_Génériques();

	}


	@SuppressWarnings("unused")
	private static void Illustation_Collections_Génériques() {
		
		// + : Type Safety, Automatise, Qualité !
		// - : Pas de polymorphisme
		
		List<String> data = new ArrayList<String>();
		data.add("Rihab");
		data.add("Soumaya");
		data.add("Houssem");
		data.add("Mohamed Jbira");
		data.add("Mohamed Amine");
		
		for (String string : data) {
			
		}
		
	}

	 @Deprecated
	private static void Illustation_Collections_NON_Génériques() {

		
		// LEGACY COLLECTIONS 
		
		// + : Polymorphisme
		// -  : Pas de 'type safey' 
		
		ArrayList data = new ArrayList();
		
		data.add(111);
		data.add(222);
		data.add("Amira");
		data.add("Yassine");
		data.add(new Date());
		
		
	}
}
