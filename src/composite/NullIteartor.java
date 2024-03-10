package composite;

import java.util.Iterator;

public class NullIteartor implements Iterator {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		return null;
	}

}
