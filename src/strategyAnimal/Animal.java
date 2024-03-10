package strategyAnimal;

public abstract class Animal {
	EatBehaviour eatBehaviour;
	SoundBehaviour soundBehaviour;

	public abstract void display();
	
	public void setSound(SoundBehaviour soundBehaviour) {
		this.soundBehaviour=soundBehaviour;
	}
	
	public void setEat(EatBehaviour eatBehaviour) {
		this.eatBehaviour=eatBehaviour;
	}	
	
	public void makeSound() {
		soundBehaviour.sound();
	}

	public void makeEat() {
		eatBehaviour.eat();
	}
	
}
