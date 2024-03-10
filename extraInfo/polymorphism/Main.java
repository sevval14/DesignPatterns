package polymorphism;

public class Main {
	
	public static void main(String... args) {
		Animal animal = new Animal();
		animal.moving();
		
		Animal bird = new Bird();
		bird.moving();
		
		System.out.println(addOpertaion(1, 2));
		System.out.println(addOpertaion(1, 2, 3));
		System.out.println(addOpertaion("hey", 2));

		
		
	}
	
	public static int addOpertaion(int a , int b) {
		return a+b;
	}
	
	public static int addOpertaion(int a , int b , int c) {
		return a+b+c;
	}
	
	public static int addOpertaion(String a , int b) {
		return b;
	}

}

class Animal {
	
	public void moving() {
		System.out.println("Animal can walk");
	}
}

class Bird extends Animal {
	
	public void moving() {
		System.out.println("Animal can walk and fly");
	}
}
