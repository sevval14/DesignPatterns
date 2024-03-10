package strategyAnimal;

public class Dog extends Animal{
	
	public Dog() {
		eatBehaviour = new Bone();
		soundBehaviour = new Bark();
		//instead of up you can like down
		//setSound(new Bark());
	}

	@Override
	public void display() {
		System.out.println("I am a dog");
	}

}
