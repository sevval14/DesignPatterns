package factoryAbstract;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactor {

	@Override
	public Dough createDough() {
		return new ThickDough();
	}

	@Override
	public Dough createSauce() {
		// TODO Auto-generated method stub
		return null;
	}

}
