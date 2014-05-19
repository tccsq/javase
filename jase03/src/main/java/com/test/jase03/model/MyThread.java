package com.test.jase03.model;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Thread:" + Thread.currentThread().getName()
					+ "," + i);
		}
	}

}
