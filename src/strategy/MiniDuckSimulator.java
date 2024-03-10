package strategy;

public class MiniDuckSimulator {

	public static void main(String... args) {
		
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		System.out.println("---------------------------");
		
		Duck redHeaded = new RedHeaded();
		redHeaded.display();
		redHeaded.performFly(); 
		redHeaded.performQuack();
		redHeaded.setFlyBehavior(new FlyWithWings());
		redHeaded.performFly();//begins as a nofly duck
	

	}

}
