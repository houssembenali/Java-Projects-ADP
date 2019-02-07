package com.adp.client;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.adp.domain.Product;

public class App {
	public static void main(String[] args) {

//		String st1 = "Asslama";
//		String st2 = "Asslama";
//
//		System.out.println(st1 == st2);

//		String stringref1 = new String("Asslama");
//		String stringref2 = new String("Asslama");
//		System.out.println(stringref1.equals(stringref2));

		Product product1 = new Product("P100", "Café", BigDecimal.ONE);
		
		Product product2 = new Product("P100", "Café", BigDecimal.ONE);
		
		
	List<Integer> ll = new ArrayList<Integer>();
	
		
	    
		Class<Product> classProduct= (Class<Product>) product1.getClass();
		
		classProduct.
		
		
		if (product1.equals(product2)) {
			System.out.println("They are EQUAL !");
		}
	    else {
			System.out.println(" They are NOT EQUAL ( Different )");
		}

		// System.out.println(product1 == product2);

	}
}
