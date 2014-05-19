package cn.com.pera.head.entities;

import cn.com.pera.head.interfaces.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.description = "HouseBlend";
	}

	@Override
	public float cost() {
		return 0.89f;
	}

}
