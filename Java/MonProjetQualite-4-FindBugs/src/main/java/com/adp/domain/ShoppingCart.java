package com.adp.domain;

import java.util.List;

public class ShoppingCart { 
    
	private List<Item> items; 
    
	public void addItem(Item item) { 
        items.add(item); 
   } 
} 
