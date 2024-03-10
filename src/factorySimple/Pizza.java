package factorySimple;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	
	
		private String name;
		private String dough;
		
		
		
		private String sauce;
		List<String> toppings = new ArrayList<String>();
	
		void prepare() {
			System.out.println("Preparing .. " + getName() );
			System.out.println("Tossing dough...");
			System.out.println("Adding sauce...");
			System.out.println("Adding toppings: ");
			for (String topping : toppings) {
				System.out.println("   " + topping);
			}
		 }

		 void bake() {
		 System.out.println("Bake for 25 minutes at 350");
		 }
		 void cut() {
		 System.out.println("Cutting the pizza into diagonal slices");
		 }

		 void box() {
		 System.out.println("Place pizza in official PizzaStore box");
		 }
		 
			public String getName() {
				return name;
			}

			public String getDough() {
				return dough;
			}

			public String getSauce() {
				return sauce;
			}

			public List<String> getToppings() {
				return toppings;
			}
			
			public void setName(String name) {
				this.name = name;
			}

			public void setDough(String dough) {
				this.dough = dough;
			}

			public void setSauce(String sauce) {
				this.sauce = sauce;
			}

			public void setToppings(List<String> toppings) {
				this.toppings = toppings;
			}
			
			public String toString() {
				StringBuffer stringBuffer = new StringBuffer();
				stringBuffer.append("---- " + getName()+ " ----\n");
				stringBuffer.append(dough + "\n");
				stringBuffer.append(sauce + "\n");
				
				for (String topping : toppings) {
					stringBuffer.append(topping + "\n");
				}
				
				return stringBuffer.toString();
				
			}
		 
		 


}		
