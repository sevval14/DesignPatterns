package strategyExample;

public class StartGame {

	public static void main(String[] args) {
		Character kingCharacter = new King();
		kingCharacter.fight();
		kingCharacter.setWeapon(new SwordBehavior());
		kingCharacter.fight();
		System.out.println("--------------------------------");


	}

}
