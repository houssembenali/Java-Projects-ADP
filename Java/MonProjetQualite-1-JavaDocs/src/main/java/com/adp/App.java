package com.adp;

import java.math.BigDecimal;

import com.adp.domain.Product;

/**
 * Client Main.
 *
 */
public class App 
{
	/**
	 * 
	 * @param args Arguments de la ligne de commande.
	 * 
	 */
    public static void main( String[] args )
    {
        Product p  = 
      new Product("P100", "Chocolat", BigDecimal.valueOf(2.5));
   
        System.out.println(p);
      
    }
}
