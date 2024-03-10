package iterator;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	CafeMenu cafeMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu,DinerMenu dinerMenu,CafeMenu cafeMenu) {
		this.pancakeHouseMenu=pancakeHouseMenu;
		this.dinerMenu =dinerMenu;
		this.cafeMenu=cafeMenu;

	}
	
	public void printMenu() {
		Iterator pancakeMenu = pancakeHouseMenu.getMenuItems();
		Iterator dinerMen = dinerMenu.getMenuItem();
		java.util.Iterator cafMenu =  cafeMenu.getMenuItems();

		printMenu(pancakeMenu);
		System.out.println("-----------------------------");
		printMenu(dinerMen);
		System.out.println("------------------------------");
		printMenuIterator(cafMenu);
	}

	private void printMenuIterator(java.util.Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem item = (MenuItem) iterator.next();
			System.out.println(item.name);
			System.out.println(item.description);
			System.out.println(item.isVetegarian);
			System.out.println(item.price);

		}
		
	}

	private void printMenu(Iterator iterator) {
		while(iterator.hasnext()) {
			MenuItem item = (MenuItem) iterator.next();
			System.out.println(item.name);
			System.out.println(item.description);
			System.out.println(item.isVetegarian);
			System.out.println(item.price);

		}
	}	

}
