package cn.com.pera.iterator.entity;

public class DinerMenu {
	private static final int MAX_LENGTH = 6;
	private int numberOfItems = 0;
	private MenuItem[] menuitems;

	public DinerMenu() {
		menuitems = new MenuItem[MAX_LENGTH];
		addItem("蔬菜三明治", "随便来点蔬菜", 2.99f, true);
		addItem("牛肉汤", "牛肉、火腿肠", 2.99f, false);
		addItem("意大利面", "小火腿、面条", 3.29f, false);
		addItem("热狗", "大火腿、大面包", 3.05f, true);
	}

	public void addItem(String name, String desc, double price,
			boolean vegetarian) {
		MenuItem menu = new MenuItem(name, desc, price, vegetarian);
		if (MAX_LENGTH <= menuitems.length) {
			menuitems[numberOfItems] = menu;
			numberOfItems++;
		} else {
			System.out.println("菜单满了！先删除一些吧");
		}
	}

	public MenuItem[] getMenuitems() {
		return menuitems;
	}

}
