package factoryExample;

public class NYCPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		IngredientFactory ingredient = new NYCIngredientFactory();
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza(ingredient);
			pizza.setName("NYC Cheese Pizza");
		}else {
			pizza = new PeperonniPizza(ingredient);
			pizza.setName("NYC Peporonni Pizza");

		}
		return pizza;
	}

	
}
