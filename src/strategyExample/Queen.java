package strategyExample;

public class Queen extends Character{
	
	public Queen() {
		weaponBehavior = new AxeBehavior();
		}

	@Override
	public void fight() {
		weaponBehavior.useWeapon();
	}
	
	
}
