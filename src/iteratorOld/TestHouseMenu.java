package iteratorOld;

import java.util.ArrayList;

public class TestHouseMenu {
	
	public static void main(String[] args) {
		
		PancakeHouseMenu pancakeHouseMenu = new  PancakeHouseMenu();
		ArrayList pancakeList = pancakeHouseMenu.getMenuItems();
		
		System.out.println(pancakeList);
		
		for(int i=0; i<pancakeList.size();i++) {
			MenuItem item = (MenuItem) pancakeList.get(i);
			System.out.print(item.name + " ");
			System.out.print(item.description + " ");
			System.out.print(item.isVegetarian + " ");
			System.out.println(item.price + " ");

		}
	
		
		DinerMenu dinerMenu = new  DinerMenu();
		MenuItem[] dinerList = dinerMenu.getMenuList();
		
		System.out.println(dinerList);
		
		for(int i=0; i<dinerList.length;i++) {
			MenuItem item = (MenuItem) dinerList[i];
			System.out.print(item.name + " ");
			System.out.print(item.description + " ");
			System.out.print(item.isVegetarian + " ");
			System.out.println(item.price + " ");

		}
		
		
		
	}

}
