package com.adp.formation.threading_race;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SynchronizedCounter {
	private int count = 0;

	// Synchronized Method
	public synchronized void increment() {
		//System.out.println(Thread.currentThread().getName());
		count = count + 1;
	}

	public int getCount() {
		return count;
	}
}

public class RaceConditionSolvedExample {
	public static void main(String[] args) throws InterruptedException {
		
		long initialTime = System.currentTimeMillis();
		
		ExecutorService executorService = Executors.newFixedThreadPool(100);

		SynchronizedCounter synchronizedCounter = new SynchronizedCounter();

		for (int i = 0; i < 10000; i++) {
			executorService.submit(() -> synchronizedCounter.increment());
		}

		executorService.shutdown();
		executorService.awaitTermination(60, TimeUnit.SECONDS);

		System.out.println("Final count is : " + synchronizedCounter.getCount());
		long elapsedTime = System.currentTimeMillis() - initialTime;
		System.out.println("Avec synchronized  : "+elapsedTime);
	
	}
}
