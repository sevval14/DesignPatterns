package iteratorOld;

import java.util.ArrayList;

public class PancakeHouseMenu {
		
	ArrayList menuitems;
	
	public PancakeHouseMenu() {
		
		menuitems = new ArrayList();
		
		addItems("Burger" , "description" ,false ,5.0);
		addItems("Soup" , "description" ,true ,1.0);


	}

	private void addItems(String name, String description, boolean b, double d) {
		MenuItem item = new MenuItem(name, description, b, d);
		menuitems.add(item);
	}
	
	
	public ArrayList getMenuItems() {
		return menuitems;
	}
	
	

	
}
