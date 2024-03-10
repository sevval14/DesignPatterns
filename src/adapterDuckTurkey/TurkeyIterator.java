package adapterDuckTurkey;

public class TurkeyIterator implements Duck{
	
	Turkey turkey;
	
	public TurkeyIterator(Turkey turkey) {
		this.turkey=turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		turkey.fly();
	}

}
