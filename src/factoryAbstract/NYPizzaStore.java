package factoryAbstract;

public class NYPizzaStore extends PizzaStore {



	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactor ingredientFactory = new NYPizzaIngredientFactory();

        	if (type.equals("cheese")) {
        		pizza = new CheesePizza(ingredientFactory);
    			pizza.setName("New York Style Cheese Pizza");
        	}else {
        		System.out.println("Plase write another pizza name");
        	}
        	return pizza;
	}



}
