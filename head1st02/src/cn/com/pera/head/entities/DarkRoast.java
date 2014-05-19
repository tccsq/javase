package cn.com.pera.head.entities;

import cn.com.pera.head.interfaces.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		this.description = "DarkRoast";
	}

	@Override
	public float cost() {
		return 0.99f;
	}

}
