package factoryAbstract;

public class ChiagoPizzaStore extends PizzaStore {



	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactor ingredientFactory = new ChicagoPizzaIngredientFactory();

        	if (type.equals("cheese")) {
        		pizza = new CheesePizza(ingredientFactory);
    			pizza.setName("Chiago Style Cheese Pizza");
        	}else {
        		System.out.println("Plase write another pizza name");
        	}
        	return pizza;
	}



}
