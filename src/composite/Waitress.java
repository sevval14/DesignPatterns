package composite;

import java.util.Iterator;

public class Waitress {

	MenuComponent allComponent;
	
	public Waitress(MenuComponent allComponent) {
		this.allComponent=allComponent;
	}
	
	public void printMenu() {
		allComponent.print();
	}
	
	public void printVetegarian() {
		Iterator iterator = allComponent.createIterator();
		
		while(iterator.hasNext()) {
			MenuComponent component = (MenuComponent) iterator.next();
			
			try {
				 if (component.isVegetarian()) {
					 component.print();
				 }
				 } catch (UnsupportedOperationException e) {}

		}
	}
}
