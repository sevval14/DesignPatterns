package template;

public abstract class CaffeBeverage {

	final void prepareReceipe() {
		boilWater();
		pourInCup();
		brew();
		if(wantCondiments()) {
			addCondiments();

		}
	}

	public boolean wantCondiments() {
		return false;
	}

	protected abstract void addCondiments();

	protected abstract void brew();

	private void pourInCup() {
		System.out.println("pourInCup");
		
	}

	private void boilWater() {
		System.out.println("water");
	}
	
}
