package factoryExample;

public class NYCIngredientFactory implements IngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickDough();
	}

	@Override
	public Sauce createSauce() {
		return new TomatoSauce();
	}

}
