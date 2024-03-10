package strategyExample;

public class Troll extends Character{
	
	public Troll() {
		weaponBehavior = new BowAndArrowBehavior();

	}

	@Override
	public void fight() {
		weaponBehavior.useWeapon();
		}
}
