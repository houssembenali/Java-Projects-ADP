package com.adp.nouveautes_java_5;

import java.util.ArrayList;
import java.util.Date;

public class Demo_PrefedinedAnnotations {

		
	@Deprecated
	public static void doSomeThingInAnOddWay() {
		// This does something in odd way ...
	}
	
	public static void doSomeThingInAnElegantWay() {
		// This does something in elegant way ...
	}
	
	
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {
	
		ArrayList data = new ArrayList();
		doSomeThingInAnOddWay();
		
		
		Date d = new Date();
		d.getMonth();

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
