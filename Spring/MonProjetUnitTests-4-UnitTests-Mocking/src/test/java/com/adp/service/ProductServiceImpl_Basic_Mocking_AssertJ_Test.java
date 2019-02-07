package com.adp.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static  org.mockito.Mockito.mock;
import static  org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import com.adp.domain.Product;
import com.adp.repository.IProductsRepository;

public class ProductServiceImpl_Basic_Mocking_AssertJ_Test {

	private ProductsServiceImpl underTest;
	private IProductsRepository my_mock ;
	
	@Before
	public void setUp() throws Exception {
		
		underTest = new ProductsServiceImpl();
		
		my_mock= mock(IProductsRepository.class);
		when(my_mock.findAll()).thenReturn(Arrays.asList(
					new Product("P100", "Café", 10),
					new Product("P200", "Thé", 20)//,
//					new Product("P300", "Coca Cola", 30),
//					new Product("P400", "Jus d'orange", 40)
				));		
		underTest.setRepo(my_mock);		
	}

	@After
	public void tearDown() throws Exception {
		underTest = null;
	}

	@Test
	public final void testCalculerMontantFacture_Plus_De_Trois_Produits() {
		
		// Given
		double expected = 30  ;
		
		// When -Then
		assertThat(underTest.calculerMontantFacture()).
		           as("Le prix de %d produits doit tenir compte de la remise de 10 %%" , my_mock.findAll().size()).
		           isEqualTo(expected);
		
		
		
	}

}
