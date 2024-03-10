package composite;


public class TestComposite {
	
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("Pancake" , "breakfast");
		MenuComponent dinerMenu = new Menu("Diner" , "evening");
		MenuComponent cafeMenu = new Menu("Cafe" , "coffee");
		MenuComponent dessertMenu = new Menu("Dessert" , "sweet");
		
		MenuComponent allMenu = new Menu("All Menus" , "WELCOME");
		
		allMenu.add(pancakeHouseMenu);
		allMenu.add(dinerMenu);
		allMenu.add(cafeMenu);

		pancakeHouseMenu.add(new MenuItem("pancake", "banana", false, 5.0));
		dinerMenu.add(new MenuItem("soup", "salt", true, 2.0));
		cafeMenu.add(new MenuItem("latte", "milk", true, 1.0));

		cafeMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("magnolya", "banana", false, 5.0));

		Waitress waitress = new Waitress(allMenu);
		waitress.printMenu();
		System.out.println("*********************************");
		waitress.printVetegarian();




	}

}
