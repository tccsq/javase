package cn.com.pera.head.entities;

import cn.com.pera.head.interfaces.Beverage;
import cn.com.pera.head.interfaces.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public float cost() {
		return this.beverage.cost() + 0.2f;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ",mocha";
	}

}
