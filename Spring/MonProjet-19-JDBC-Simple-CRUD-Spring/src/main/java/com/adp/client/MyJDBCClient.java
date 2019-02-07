package com.adp.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adp.repository.IComptesRepository;

public class MyJDBCClient {

     private static IComptesRepository repository;
	
	public IComptesRepository getRepository() {
		return repository;
	}

	public void setRepository(IComptesRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MyJDBCClient client = context.getBean(MyJDBCClient.class);
		
		client.getRepository().findAll().forEach(System.out::println);
	
	}

}
