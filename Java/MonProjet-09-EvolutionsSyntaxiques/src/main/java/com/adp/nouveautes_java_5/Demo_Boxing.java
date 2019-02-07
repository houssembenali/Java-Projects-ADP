package com.adp.nouveautes_java_5;

import java.util.ArrayList;
import java.util.Date;

import static java.lang.Math.*;

public class Demo_Boxing {

	@SuppressWarnings("unused")
	public static void main(String... args) {
		
		Date date = new Date();
		System.out.println(date.getDate());
		
		
		int res = abs(-1);
	
		//String.format("Je m'appelle %s ", args)
		
		ArrayList<Integer> data = new ArrayList<>();
		
		data.add(55);  // Boxing is working here !
		data.add(66);
		
		
		int i = 11;	
		
		
		Integer jj =  i;  // Boxing 
		
		
		int k =  jj;     // OutBxing = UnBoxing
		

		
		
		Double d  = 12.5;  // Boxing here
		
		double dd = d;  //Unboxing 
	}

}
