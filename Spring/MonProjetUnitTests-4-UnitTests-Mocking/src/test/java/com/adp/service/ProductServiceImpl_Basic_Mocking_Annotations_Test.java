package com.adp.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static  org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.adp.domain.Product;
import com.adp.repository.IProductsRepository;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceImpl_Basic_Mocking_Annotations_Test {

	@InjectMocks
	private ProductsServiceImpl underTest;
//	
	@Mock
	private IProductsRepository my_mock ;
//	
	@Before
	public void setUp() throws Exception {		
		//underTest = new ProductsServiceImpl();		
	}

	@After
	public void tearDown() throws Exception {
		underTest = null;
	}

	@Test
	public final void testCalculerMontantFacture_Plus_De_Trois_Produits() {
		
		// Given
		//my_mock= mock(IProductsRepository.class);
		when(my_mock.findAll()).thenReturn(Arrays.asList(
							new Product("P100", "Café", 10),
							new Product("P200", "Thé", 20),
							new Product("P300", "Coca Cola", 30),
							new Product("P400", "Jus d'orange", 40)
						));		
		//underTest.setRepo(my_mock);		
		
		double expected = 90  ;
		
		// When -Then
		assertThat(underTest.calculerMontantFacture()).isEqualTo(expected);
		
		
		
	}

}
