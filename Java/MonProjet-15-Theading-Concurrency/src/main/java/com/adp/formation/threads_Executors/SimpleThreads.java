package com.adp.formation.threads_Executors;


class MonThread extends Thread {
    public MonThread(String st){   //Constructeur de la classe
         super(st);
     }
    public void run() {    //Moteur du Thread
          for (int i=1;i<=100;i++)
                 System.out.println(i + "  " + getName());
     }
}

public class SimpleThreads {

	public static void main(String[] args) {
        Thread t1 =   new MonThread ("Fell");
        Thread t2 =  new MonThread ("Jasmin");
        
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        

	}

}
