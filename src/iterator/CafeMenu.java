package iterator;
import java.util.Iterator; 
import java.util.Hashtable;

public class CafeMenu {
	 Hashtable menuItems = new Hashtable();

		public CafeMenu() {
			
			addItems("Diner", "descriptionForDiner",false,5.0);

		}

		private void addItems(String string, String string2, boolean b, double d) {
			MenuItem item = new MenuItem(string, string2, b, d);
			menuItems.put(item.getName(), item);
		}
		
		public Iterator getMenuItems() {
			return (Iterator) menuItems.values().iterator();
		}
}
