package com.adp.client;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adp.business.IComptesBusiness;

public class MyJDBCClient {

	private static IComptesBusiness bo;

	public static IComptesBusiness getBo() {
		return bo;
	}

	public static void setBo(IComptesBusiness bo) {
		MyJDBCClient.bo = bo;
	}

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MyJDBCClient client = context.getBean(MyJDBCClient.class);

		BigDecimal solde = client.getBo().consulterSolde("A100");
		System.out.println("Solde : "+solde);

	}

}
