package factoryExample;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		
		IngredientFactory ingredientFactory = new ChicagoIngredientFactory();
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Cheese Pizza");
		}else {
			pizza = new PeperonniPizza(ingredientFactory);
			pizza.setName("Peperonni Cheese Pizza");


		}
		
		return pizza;
	}

}
