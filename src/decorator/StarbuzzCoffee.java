package decorator;

import decorator.Beverage.Size;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		
		Beverage darkRoast = new DarkRoast();
		System.out.println(darkRoast.getDescription()+ " : " + darkRoast.cost() +"$");
		
		System.out.println("----------------------------");
		darkRoast = new Milk(new DarkRoast());
		System.out.println(darkRoast.getDescription()+ " : " + darkRoast.cost() +"$");
		
		System.out.println("----------------------------");
		darkRoast = new Mocha(new Milk(new Mocha(new DarkRoast())));
		System.out.println(darkRoast.getDescription()+ " : " + darkRoast.cost() +"$");
		
		System.out.println("----------------------------");
		darkRoast = new Soy(new Mocha(new Milk(new Mocha(new DarkRoast()))));
		darkRoast.setSize(Size.VENTI);
		System.out.println(darkRoast.getSize());
		System.out.println(darkRoast.getDescription()+ " : " + darkRoast.cost() +"$");
		
		System.out.println("----------------------------");
		
		darkRoast = new Soy(new Mocha(new Milk(new Mocha(new DarkRoast()))));
		darkRoast.setSize(Size.TALL);
		System.out.println(darkRoast.getSize());
		System.out.println(darkRoast.getDescription()+ " : " + darkRoast.cost() +"$");
		
		

		
		
	}
}
