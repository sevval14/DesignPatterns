package factoryMethod;

public class TestPizza {
	
	public static void main(String[] args) {
		PizzaStore chiagoPizzaStore = new ChicagoPizzaStore();	
		PizzaStore chiagoPizzaStore1 = new ChicagoPizzaStore();	
		
		
		Pizza pizza = chiagoPizzaStore.orderPizza("cheese");
		System.out.println(pizza);


		
		}
}
