package com.adp.strings;

public class Demo_Strings {

	public static void main(String[] args) {
	
//		String s = "Java";
//		
//		s = s.concat(" Rules ! ");
//		
//		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Java");
		sb.append(" Rules !");
		System.out.println(sb);

	}

}
