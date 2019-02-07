package com.adp.nouveautes_java_5;


@NoteQualite(value=1)
class Produit {

}
@NoteQualite(value=5)
class Client {

}

public class Demo_UserAnnotation {

	public static void main(String[] args) {
		
		
		int i = 10_00_00_0;
		
		System.out.println(i);
		Client  c = new Client();		
		
		int note = c.getClass().getAnnotation(NoteQualite.class).value();
		System.out.println(" Note détectée : "+ note);
		

	}

}
