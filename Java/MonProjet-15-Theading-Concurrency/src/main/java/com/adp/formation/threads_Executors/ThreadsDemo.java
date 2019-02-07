package com.adp.formation.threads_Executors;

import java.util.concurrent.TimeUnit;

public class ThreadsDemo{
	
	
    public static void main(String[] args) {
    	
    	Runnable task = () -> {
    	    String threadName = Thread.currentThread().getName();
    	    System.out.println("Hello " + threadName);
    	};
    	
    	Runnable runnable = () -> {
    	    try {
    	        String name = Thread.currentThread().getName();
    	        System.out.println("Foo " + name);
    	        TimeUnit.SECONDS.sleep(1);
    	        System.out.println("Bar " + name);
    	    }
    	    catch (InterruptedException e) {
    	        e.printStackTrace();
    	    }
    	};

    	

    	Thread thread = new Thread(runnable);
    	thread.start();
    	

    	System.out.println(">>>>>>>>>>>> Done!");
    }    
}
