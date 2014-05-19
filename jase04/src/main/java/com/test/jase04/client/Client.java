package com.test.jase04.client;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 食物数量
		int foodCount = 0;
		// 创建10个消费者和一个厨师
		Cook cook = new Cook(foodCount);

		Thread thread = new Thread(cook);
		thread.start();
		
		int consumerCount = 10;
		for (int i = 0; i < consumerCount; i++) {
			Consumer c = new Consumer(foodCount);
			Thread t = new Thread(c);
			t.start();
		}
		
	}

}
