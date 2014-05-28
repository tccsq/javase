package cn.com.pera.iterator.impl;

import java.util.ArrayList;
import java.util.List;

import cn.com.pera.iterator.entity.MenuItem;
import cn.com.pera.iterator.interfaces.Iterator;

public class PancakeHouseMenuWithIterator {

	private List<MenuItem> menuitems;

	public PancakeHouseMenuWithIterator() {
		this.menuitems = new ArrayList<MenuItem>();
		addItem("山东煎饼早餐", "煎鸡蛋", 2.99f, true);
		addItem("标准煎饼早餐", "煎鸡蛋加火腿肠", 2.99f, false);
		addItem("蓝莓煎饼早餐", "煎鸡蛋、蓝莓", 2.49f, true);
		addItem("华府饼早餐", "煎鸡蛋、华夫饼干", 3.59f, true);
	}

	public void addItem(String name, String desc, double price,
			boolean vegetarian) {
		MenuItem menu = new MenuItem(name, desc, price, vegetarian);
		menuitems.add(menu);
	}

	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuitems);
	}

}
