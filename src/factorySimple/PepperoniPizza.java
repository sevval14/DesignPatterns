package factorySimple;

public class PepperoniPizza extends Pizza {

	public PepperoniPizza() {
		setName("Pepperoni Pizza");
		setDough("Crust Dough");
		setSauce("Marinara Sauce"); 
		toppings.add("Sliced Pepperoni");
		toppings.add("Sliced Onion");
		toppings.add("Grated parmesan cheese");
	}
}
