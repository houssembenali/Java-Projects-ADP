package com.adp.strings;

import java.util.StringTokenizer;

public class Demo_Tokenizing {

	public static void main(String... args) {

		String source = "bonjour1comment1ca1va1il1fait1froid";
		String pattern = "1";
		
		//tokensWithSplit(source, pattern);
		tokensWithStringTokenizer(source,pattern);

	}

	private static void tokensWithStringTokenizer(String source, String pattern) {
		
		StringTokenizer tokenizer = new StringTokenizer(source,pattern);
		
		while (tokenizer.hasMoreElements()) {
			System.out.print(tokenizer.nextToken()+ " - ");
			
		}
		System.out.println();
		
	}

	@SuppressWarnings("unused")
	private static void tokensWithSplit(String source, String pattern) {
		String[] tokens = source.split(pattern);

		System.out.println(String.format("Il y a %d tokens", tokens.length));

		for (String token : tokens)
			System.out.print(token + " - ");

		System.out.println();
	}

}
