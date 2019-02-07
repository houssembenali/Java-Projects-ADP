package com.adp;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Arrays;

import com.adp.dataaccess.IProductsRepository;
import com.adp.domain.Product;

public class App 
{
    public static void main( String[] args )
    {
        // Création du mock
    	IProductsRepository repo = mock(IProductsRepository.class);
    	
    	// Initialiser le mock
    	when(repo.findAll()).thenReturn(Arrays.asList(
    		new Product("F1000", BigDecimal.TEN),
    		new Product("F2000", BigDecimal.TEN),
    		new Product("F3000", BigDecimal.TEN)
    	));
    	
    	repo.findAll().forEach(System.out::println);
    }
}
