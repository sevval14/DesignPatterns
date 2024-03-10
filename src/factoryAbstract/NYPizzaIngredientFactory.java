package factoryAbstract;

public class NYPizzaIngredientFactory implements PizzaIngredientFactor {

	@Override
	public Dough createDough() {
		return new ThinDough();
	}

	@Override
	public Dough createSauce() {
		// TODO Auto-generated method stub
		return null;
	}

}
