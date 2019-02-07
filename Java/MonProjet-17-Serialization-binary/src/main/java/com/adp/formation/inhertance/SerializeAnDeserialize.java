package com.adp.formation.inhertance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class SerializeAnDeserialize {

	public static void main(String[] args) {

		Employee employee = new Employee("Ahmed", BigDecimal.TEN);
		List<Qualification> qualif = Arrays.asList(
				new Qualification("Java"),
				new Qualification("QA"),
				new Qualification("Management") );
		employee.setQualifications(qualif);

		//Person person = new Person("Mohamed");
		
		serializeIt(employee);
		deSerializeIt();

	}

	private static void serializeIt(Person employee) {
		try {
			FileOutputStream fos = new FileOutputStream("myfileemploye");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println("Séralisé avec succès ...");

	}

	private static void deSerializeIt() {
		Person e = null;
		try {
			FileInputStream fis = new FileInputStream("myfileemploye");
			ObjectInputStream ois = new ObjectInputStream(fis);
			e = (Employee) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			System.out.println("LOG : " + ioe);
		} catch (ClassNotFoundException c) {
			System.out.println("LOG : " + c);

		}
		System.out.println("Résultat de la désérialisation : " + e);

	}

}
