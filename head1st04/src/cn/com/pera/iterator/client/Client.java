package cn.com.pera.iterator.client;

import cn.com.pera.iterator.entity.DinerMenu;
import cn.com.pera.iterator.entity.PancakeHouseMenu;
import cn.com.pera.iterator.entity.Waitress;
import cn.com.pera.iterator.entity.WaitressWithIterator;
import cn.com.pera.iterator.impl.DinerMenuWithIterator;
import cn.com.pera.iterator.impl.PancakeHouseMenuWithIterator;
import cn.com.pera.iterator.interfaces.Serverable;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PancakeHouseMenu phMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		PancakeHouseMenuWithIterator phMenu1 = new PancakeHouseMenuWithIterator();
		DinerMenuWithIterator dinerMenu1 = new DinerMenuWithIterator();

		Waitress waitress = new Waitress(dinerMenu, phMenu);
		WaitressWithIterator waitressWithIterator = new WaitressWithIterator(
				dinerMenu1, phMenu1);
		
		action(waitressWithIterator);
	}

	public static void action(Serverable serve) {
		serve.printMenu();
	}
}
