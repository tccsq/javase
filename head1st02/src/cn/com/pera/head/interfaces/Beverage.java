package cn.com.pera.head.interfaces;

public abstract class Beverage {
	protected String description = "未知饮料";

	public String getDescription() {
		return description;
	}

	public abstract float cost();
}
