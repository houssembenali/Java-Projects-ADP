package com.adp.ui;

import com.adp.library.facade.IGreetings;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	IGreetings mockGreet =  mock(IGreetings.class);
    	when(mockGreet.greetMe()).thenReturn("Asslama ...");
    	
    	System.out.println(mockGreet.greetMe());
    	
    }
}
