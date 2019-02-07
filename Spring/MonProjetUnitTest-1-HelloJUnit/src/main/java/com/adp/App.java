package com.adp;

import com.adp.business.Calcul;
import com.adp.business.ICalcul;

public class App 
{
    public static void main( String[] args )
    {
        ICalcul calcul = new Calcul();
        System.out.println(calcul.additioner(11,22));
    }
}
