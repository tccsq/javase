package cn.com.pera.iterator.entity;

import cn.com.pera.iterator.interfaces.Serverable;

public class Waitress implements Serverable {
	private DinerMenu dinerMenu;
	private PancakeHouseMenu phMenu;

	public Waitress(DinerMenu dinerMenu, PancakeHouseMenu phMenu) {
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
		for (MenuItem menuItem : phMenu.getMenuitems()) {
			System.out.println(menuItem);
		}
	}

	@Override
	public void printLunchMenu() {
		for (MenuItem menuItem : dinerMenu.getMenuitems()) {
			System.out.println(menuItem);
		}
	}

	@Override
	public void printVegetarian() {
		for (MenuItem menuItem : phMenu.getMenuitems()) {
			if (menuItem.isVegetarian())
				System.out.println(menuItem);
		}

		for (MenuItem menuItem : dinerMenu.getMenuitems()) {
			if (menuItem.isVegetarian())
				System.out.println(menuItem);
		}
	}

	@Override
	public boolean isVegetarian(String name) {
		return false;
	}
}
