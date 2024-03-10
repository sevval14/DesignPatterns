package factoryAbstract;

public class CheesePizza extends Pizza{

	PizzaIngredientFactor ingredientFactory;
	
	
	
	 
	public CheesePizza(PizzaIngredientFactor ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
		
		
		dough = ingredientFactory.createDough();
		
		

	}

	

}
