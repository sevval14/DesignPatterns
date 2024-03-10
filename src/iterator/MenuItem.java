package iterator;

public class MenuItem {
	String name;
	String description;
	boolean isVetegarian;
	double price;
	
	public MenuItem(String name, String description, boolean isVetegarian, double price) {
		this.name = name;
		this.description = description;
		this.isVetegarian = isVetegarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVetegarian() {
		return isVetegarian;
	}

	public double getPrice() {
		return price;
	}
	
	

}
