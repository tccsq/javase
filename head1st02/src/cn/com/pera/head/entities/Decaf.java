package cn.com.pera.head.entities;

import cn.com.pera.head.interfaces.Beverage;

public class Decaf extends Beverage {

	public Decaf() {
		this.description = "Decaf";
	}

	@Override
	public float cost() {
		return 1.05f;
	}

}
