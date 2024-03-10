package strategyAnimal;

public class Milk implements EatBehaviour{

	@Override
	public void eat() {
		System.out.println("I am eating or drinking milk");
	}

}
