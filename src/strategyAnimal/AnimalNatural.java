package strategyAnimal;

public class AnimalNatural {
	
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.makeEat();
		cat.makeSound();
		System.out.println("----------------");
		
		dog.makeEat();
		dog.makeSound();
		System.out.println("----------------");
		
		dog.setEat(new Milk());
		dog.setSound(new Meow());
		System.out.println("----------------");
		
		dog.makeEat();
		dog.makeSound();
		System.out.println("----------------");
	
	
	}

}
