package iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {
	
	ArrayList menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		
		addItems("Pancake", "descriptionForPancake",false,5.0);
	}

	private void addItems(String string, String string2, boolean b, double d) {
		MenuItem item = new MenuItem(string, string2, b, d);
		menuItems.add(item);
	}
	
	public Iterator getMenuItems() {
		return new PancakeIterator(menuItems);
	}

}
	