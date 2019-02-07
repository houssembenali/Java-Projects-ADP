package com.adp;

import java.io.IOException;

public class App {
	private static final int MAX = 5;

	public static void main(String[] args) {

		for (int i = 1; i <= MAX; i++) {
			afficher_i_courant(i);
		}
		
		try {
			int a= 11;
			int b = 0;
			int c = a/b;
			throw new IOException();
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			do_As_Finally();
		}
		
		
	}

	private static void do_As_Finally() {
		// TODO Auto-generated method stub
		
	}

	private static void afficher_i_courant(int i) {
		System.out.println(i + " Hello World!");
	}
}
