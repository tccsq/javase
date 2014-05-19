package com.test.jase03.client;

import com.test.jase03.model.MyRunable;
import com.test.jase03.model.MyThread;

public class ThreadClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread mythread = new MyThread();
		mythread.start();
		
		Runnable r = new MyRunable();
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Thread:" + Thread.currentThread().getName()
					+ "," + i);
		}
	}

}
