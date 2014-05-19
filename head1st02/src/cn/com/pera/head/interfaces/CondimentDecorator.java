package cn.com.pera.head.interfaces;

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;

	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public abstract String getDescription();

}
