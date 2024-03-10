package iterator;

public class DinerIterator implements Iterator {
	
	MenuItem[] menuItems;
	int position=0;
	
	public DinerIterator(MenuItem[] menuItems) {
		this.menuItems=menuItems;
	}
	

	@Override
	public boolean hasnext() {
		if(position >= menuItems.length || menuItems[position] == null ) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem item = menuItems[position];
		position++;
		return item;
	}

}
