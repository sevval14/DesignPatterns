package iteratorOld;

public class MenuItem {
	
	String name;
	String description;
	boolean isVegetarian;
	double price;
	
	
	public MenuItem(String name, String description,boolean isVegetarian, double price) {
		this.name = name;
		this.description = description;
		this.isVegetarian = isVegetarian;
		this.price = price;
	}
	

	
	public boolean getVegetarian() {
		return true;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	

}
