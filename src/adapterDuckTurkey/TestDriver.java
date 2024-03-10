package adapterDuckTurkey;

public class TestDriver {
	public static void main(String[] args) {
		
		Duck mallardDuck = new MallardDuck();
		Turkey wildTurkey = new WildTurkey();
		
		System.out.println("Normal mallard duck");
		mallardDuck.fly();
		mallardDuck.quack();
		
		System.out.println("\n Normal wild turkey");
		wildTurkey.fly();
		wildTurkey.gobble();
		
		System.out.println("\n Adapter wild turkey");
		TurkeyIterator turkeyIterator = new TurkeyIterator(wildTurkey);
		turkeyIterator.fly();
		turkeyIterator.quack();
		
		
		System.out.println("\n Adapter mallard duck");
		DuckIterator duckIterator = new DuckIterator(mallardDuck);
		duckIterator.fly();
		duckIterator.gobble();
	}
}
