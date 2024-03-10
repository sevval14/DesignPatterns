package factoryExample;

public class TestPizza {

	public static void main(String[] args) {
		
		PizzaStore nycPizzaStore = new NYCPizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		
		Pizza pizza = nycPizzaStore.orderPizza("cheese");
		System.out.println(pizza);
		System.out.println("--------------------");
		
		
		 pizza = chicagoPizzaStore.orderPizza("cheese");
		System.out.println(pizza);
		System.out.println("--------------------");
			
		
	}
}
