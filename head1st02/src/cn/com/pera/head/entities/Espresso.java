package cn.com.pera.head.entities;

import cn.com.pera.head.interfaces.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		this.description = "Espresso";
	}

	@Override
	public float cost() {
		return 1.99f;
	}

}
