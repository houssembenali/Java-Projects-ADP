package com.adp.formation.threading_race;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Counter {
    private int count = 0;

    public void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}

public class RaceConditionExample {

    public static void main(String[] args) throws InterruptedException {
        

		long initialTime = System.currentTimeMillis();
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);

        Counter counter = new Counter();

        for(int i = 0; i < 10000; i++) {
            executorService.submit(() -> counter.increment());
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final count is : " + counter.getCount());
        long elapsedTime = System.currentTimeMillis() - initialTime;
		System.out.println("SANS synchronized le temps : "+elapsedTime);
	
    }
}