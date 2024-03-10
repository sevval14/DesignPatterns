package adapterDuckTurkey;

public class WildTurkey implements Turkey {

	@Override
	public void fly() {
		System.out.println("I can fly as  WildTurkey");
	}

	@Override
	public void gobble() {
		System.out.println("Gobble WildTurkey ");
	}

}
