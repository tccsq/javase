package com.test.jase03.model;

public class MyRunable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Thread:" + Thread.currentThread().getName()
					+ "," + i);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
