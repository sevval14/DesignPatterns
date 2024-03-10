package composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

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
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public boolean isVegetarian() {
		return isVegetarian;
	}
	
	@Override
	public double getPrice() {
		return price;
	}
	
	@Override
	public void print() {
		System.out.print("Name : " + getName());
		if(isVegetarian()) {
			System.out.print(" (V)");
		}
		System.out.print(" Description : " + getDescription());
		System.out.println(" Price : " + getPrice());

	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new NullIteartor();
	}
	


}
