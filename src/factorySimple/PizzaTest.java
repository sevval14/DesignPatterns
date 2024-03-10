package factorySimple;

public class PizzaTest {
	
	public static void main(String[] args) {
		
		PizzaStore simplePizzaFactory = new SimplePizzaFactory();
		
		
		Pizza pizza = simplePizzaFactory.orderPizza("cheese");
		
		
		
		System.out.println("-------------------------------------");
		pizza =simplePizzaFactory.orderPizza("pepperoni");
		System.out.println("Gather ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);



		
}
}
