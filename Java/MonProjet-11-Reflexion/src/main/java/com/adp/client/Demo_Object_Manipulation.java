package com.adp.client;

import java.lang.reflect.Field;

public class Demo_Object_Manipulation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
	//	System.setSecurityManager(new SecurityManager());
		
		Compte c = new Compte();
		//Compte c2 = new Compte();
		
		
		try {
			Field[] allTheFields = Compte.class.getDeclaredFields();
			
			for (Field field : allTheFields) {
				System.out.println("====> Il y a le field : "+field);
			}
			
			Field field = Compte.class.getDeclaredField("solde");
			
		   field.setAccessible(true);   // BYTECODE MANIPULATION !
		   
		   double solde_hacked= (double)field.get(c);
		   
		   System.out.println("Hacked, le solde est : "+solde_hacked);
		
		
		
		} catch (NoSuchFieldException | 
				SecurityException | 
				IllegalArgumentException | 
				IllegalAccessException e) {
			
			System.out.println("LOG : Il y a l'exception:  "+ e);
		
		}

	}

}
