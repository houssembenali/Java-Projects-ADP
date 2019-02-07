package com.adp.client;

import com.adp.domain.Employe;
import com.adp.exceptions.AgeInvalideException;

public class App {
	public static void main(String[] args) {
		Employe employe;
		try {
			employe = new Employe("Mohamed", 5555);
			System.out.println(employe);
		} catch (AgeInvalideException e) {
			System.out.println("LOG : " + e.getMessage());
		}
		System.out.println("Fin normale du programme");

	}
}
