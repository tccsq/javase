package cn.com.pera.iterator.impl;

import java.util.List;

import cn.com.pera.iterator.entity.MenuItem;
import cn.com.pera.iterator.interfaces.Iterator;

public class PancakeHouseMenuIterator implements Iterator {
	private List<MenuItem> menuitems;
	private int position = 0;

	public PancakeHouseMenuIterator(List<MenuItem> menuitems) {
		super();
		this.menuitems = menuitems;
	}

	@Override
	public boolean hasNext() {
		if (position >= menuitems.size() || menuitems.get(position) == null)
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
		MenuItem menuItem = menuitems.get(position);
		position++;
		return menuItem;
	}
}
