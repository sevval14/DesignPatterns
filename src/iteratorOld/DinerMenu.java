package iteratorOld;

import java.util.ArrayList;

public class DinerMenu {
	
	static final int maxLenght =6;
	int currentIndex =0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[maxLenght];
		addItems("Burger" , "description" ,false ,5.0);
		addItems("Soup" , "description" ,true ,1.0);


	}

	private void addItems(String name, String description, boolean b, double d) {
		MenuItem item = new MenuItem(name, description, b, d);
		
		if(currentIndex >= maxLenght) {
			System.out.println("It is full");
		}
		else {
			menuItems[currentIndex]=item;
			currentIndex++;
		}
		
	}
	
	public MenuItem[] getMenuList() {
		return menuItems;
	}
	

	
	

	
}
