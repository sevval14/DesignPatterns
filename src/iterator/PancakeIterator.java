package iterator;

import java.util.ArrayList;

public class PancakeIterator implements Iterator {
	ArrayList<MenuItem> menuItems;
	int position =0;
	
	public PancakeIterator(ArrayList<MenuItem> menuItems) {
		this.menuItems=menuItems;
	}

	@Override
	public boolean hasnext() {
		if(position >= menuItems.size() ) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem current = menuItems.get(position);
		position++;
		return current;
	}

}
