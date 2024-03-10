package singletonChocolate;


public class ChocolateController {
	public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// aynı şeyi bir daha kullandık
		System.out.println("----------------------------");
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		if(boiler==boiler2) {
			System.out.println(boiler);
			System.out.println(boiler2);
			System.out.println("Because two objects are in same memory address");
		}
	}
}