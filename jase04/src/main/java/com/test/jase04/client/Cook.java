package com.test.jase04.client;

/**
 * 负责生产食物
 * 
 * @author shanqiang.chen
 * 
 */
public class Cook extends Person {

	public Cook(int foodCount) {
		super(foodCount);
	}

	@Override
	public void run() {
		// 如果食物数量大于0，厨师sleep，反之随机创建一些食物
		if (foodCount > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.err.println("厨师睡眠出错!");
			}
		} else {
			
		}
	}

}
