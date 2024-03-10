package strategyExample;

public abstract  class Character {
	
	WeaponBehavior weaponBehavior;
	
	public void setWeapon(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
	
	public  void fight() {
		weaponBehavior.useWeapon();	

	};
	
	//public abstract void fight(); If I write like this , it should be like Queen.class

}
	