package adapterIteratorEnumaration;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumarationAdapter implements Iterator{
	
	Enumeration enumeration;
	
	public EnumarationAdapter(Enumeration enumeration) {
		this.enumeration=enumeration;
	}

	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration.nextElement();
	}
	

}
