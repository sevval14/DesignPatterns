package commandDiner;

public class BurgerAndFries implements Order{
	Cook cook;
	
	public BurgerAndFries(Cook cook) {
		this.cook=cook;
	}

	@Override
	public void orderUp() {
		cook.makeBurger();
		cook.makeFries();
	}

}
