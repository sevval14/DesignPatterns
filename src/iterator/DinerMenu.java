package iterator;

public class DinerMenu {
	MenuItem[] menuItems;
	static int  MAX_LENGHT =5;
	int index=0;
	
	public DinerMenu() {
		menuItems = new  MenuItem[MAX_LENGHT];
		
		addItems("Diner", "descriptionForDiner",false,5.0);

	}

	private void addItems(String string, String string2, boolean b, double d) {
		MenuItem item = new MenuItem(string, string2, b, d);
		
		if(index >= MAX_LENGHT) {
			System.out.println("List is full. please stop it");
		}else {
			menuItems[index]=item;
			index++;
			
		}
	}
	
	public Iterator getMenuItem() {
		return new DinerIterator(menuItems);
	}
	
}
