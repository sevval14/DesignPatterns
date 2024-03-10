package strategyAnimal;

public class Bone implements EatBehaviour{

	@Override
	public void eat() {
		System.out.println("I am eating bone");
	}

}
