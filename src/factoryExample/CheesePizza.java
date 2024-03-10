package factoryExample;

public class CheesePizza extends Pizza {

	IngredientFactory ingredient;

	public CheesePizza(IngredientFactory ingredient) {
		this.ingredient = ingredient;
		dough = ingredient.createDough();
		sauce = ingredient.createSauce();
		
	}
	

}
