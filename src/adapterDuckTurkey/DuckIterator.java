package adapterDuckTurkey;

public class DuckIterator implements Turkey {
	
	Duck duck;
	
	public DuckIterator(Duck duck) {
		this.duck=duck;
	}
	

	@Override
	public void fly() {
		duck.fly();
	}

	@Override
	public void gobble() {
		duck.quack();
	}

	
}
