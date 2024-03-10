package strategyExample;

public class KnifeBehavior implements  WeaponBehavior{

	@Override
	public void useWeapon() {
		System.out.println("implements cutting with a knife");	
	}
	

}
