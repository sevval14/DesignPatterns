package factorySimple;

public class SimplePizzaFactory extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
				
		Pizza pizza = new Pizza();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza();		
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
		
		return pizza;
	
	}
	


}
