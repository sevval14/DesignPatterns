package adapterDuckTurkey;

public class MallardDuck  implements Duck{
	

	@Override
	public void quack() {
		System.out.println("Mallard Duck quack");
	}

	@Override
	public void fly() {
		System.out.println("I am flying as Mallard duck");
	}

}
