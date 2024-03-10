package adapterIteratorEnumaration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestAdapter {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(Arrays.asList(args));

		Iterator enumartionAdapter = new EnumarationAdapter(v.elements());
		
		while(enumartionAdapter.hasNext()) {
			System.out.println(enumartionAdapter.next());
		}
		
		System.out.println("-----------------------------------------------------");
		
		
		ArrayList<String> l = new ArrayList<String>(Arrays.asList(args));
		Enumeration<?> enumeration = new IteratorAdapter(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
