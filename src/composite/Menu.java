package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	
	ArrayList menuItems = new ArrayList();
	String name;
	String description;
	
	public Menu(String name , String description) {
		this.name=name;
		this.description=description;
	}
	
	@Override
	public void add(MenuComponent component) {
		menuItems.add(component);
	}
	
	@Override
	public void remove(MenuComponent component) {
		menuItems.remove(component);
	}
	
	@Override
	public MenuComponent getChild(int child) {
		return (MenuComponent) menuItems.get(child);
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
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new CompositeIterator(menuItems.iterator());
	}
	
	@Override
	public void print() {
		System.out.println();
		System.out.println( getName() +" " + getDescription() );
		System.out.println("---------------------------------------");
		Iterator iterator = menuItems.iterator();
		
		while(iterator.hasNext()) {
			MenuComponent menuComponent =(MenuComponent) iterator.next();
			menuComponent.print();
		}
	}

}
