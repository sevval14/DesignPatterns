package strategy;

public class RedHeaded extends Duck{

	@Override
	public void display() {
		System.out.println("I am a real Red Headed duck");
	}
	
	public RedHeaded() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	
}
