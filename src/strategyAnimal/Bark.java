package strategyAnimal;

public class Bark implements SoundBehaviour {

	@Override
	public void sound() {
		System.out.println("Bark Bark ....");
	}

}
