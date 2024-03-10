package strategy;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I am rubber duck");
		
	}
	
	public RubberDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyWithWings();
	}
}
