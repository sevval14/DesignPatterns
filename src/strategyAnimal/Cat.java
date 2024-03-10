package strategyAnimal;

public class Cat extends Animal {

	public Cat() {
		soundBehaviour = new Meow();
		eatBehaviour = new Milk();
		//instead of up exapmle you can do like down example
		//this.setEat(new Milk());
	}
	@Override
	public void display() {
		System.out.println("I am a cat");
	}

}
