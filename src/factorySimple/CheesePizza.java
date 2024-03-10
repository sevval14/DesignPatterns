package factorySimple;

public class CheesePizza extends Pizza {

	public CheesePizza() {
		setName("Cheese Pizza");
		setDough("Thin Crust Dough");
		setSauce("Marinara Sauce"); 
		toppings.add("Grated Reggiano Cheese");
	}
}
