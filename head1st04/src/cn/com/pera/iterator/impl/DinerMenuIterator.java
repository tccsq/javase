package cn.com.pera.iterator.impl;

import cn.com.pera.iterator.entity.MenuItem;
import cn.com.pera.iterator.interfaces.Iterator;

public class DinerMenuIterator implements Iterator {
	private int position = 0;
	private MenuItem[] menuitems;

	public DinerMenuIterator(MenuItem[] menuitems) {
		super();
		this.menuitems = menuitems;
	}

	@Override
	public boolean hasNext() {

		if (position >= menuitems.length || menuitems[position] == null)
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
		MenuItem menuItem = menuitems[position];
		position++;
		return menuItem;
	}

}
