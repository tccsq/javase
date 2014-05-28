package cn.com.pera.iterator.entity;

import cn.com.pera.iterator.impl.DinerMenuWithIterator;
import cn.com.pera.iterator.impl.PancakeHouseMenuWithIterator;
import cn.com.pera.iterator.interfaces.Iterator;
import cn.com.pera.iterator.interfaces.Serverable;

public class WaitressWithIterator implements Serverable {
	private DinerMenuWithIterator dinerMenu;
	private PancakeHouseMenuWithIterator phMenu;

	public WaitressWithIterator(DinerMenuWithIterator dinerMenu,
			PancakeHouseMenuWithIterator phMenu) {
		super();
		this.dinerMenu = dinerMenu;
		this.phMenu = phMenu;
	}

	@Override
	public void printMenu() {
		printBreakFastMenu();
		printLunchMenu();
	}

	@Override
	public void printBreakFastMenu() {
		Iterator iter = phMenu.createIterator();
		while (iter.hasNext()) {
			MenuItem menu = (MenuItem) iter.next();
			System.out.println(menu);
		}
	}

	@Override
	public void printLunchMenu() {
		Iterator iter = dinerMenu.createIterator();
		while (iter.hasNext()) {
			MenuItem menu = (MenuItem) iter.next();
			System.out.println(menu);
		}
	}

	@Override
	public void printVegetarian() {
		
	}

	@Override
	public boolean isVegetarian(String name) {
		return false;
	}
}
