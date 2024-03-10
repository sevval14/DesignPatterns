package factoryExample;

public class ChicagoIngredientFactory  implements IngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

}
