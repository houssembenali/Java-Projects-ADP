package com.adp.client;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Demo_Class {

	public static void main(String[] args) {

		String message = "Bonjour";

		Class maClasse = message.getClass(); // Equivalent à String.class

		Method[] methods = maClasse.getMethods();

//	    for (Method method : methods) {
//			System.out.println(method.getName());
//		}

		Arrays.asList(methods).forEach(System.out::println);

		System.out.println(" Il y a " + methods.length + " méthodes dans String");

	}

}
