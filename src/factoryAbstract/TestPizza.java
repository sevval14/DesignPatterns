package factoryAbstract;

public class TestPizza {
	
	public static void main(String[] args) {
		PizzaStore chiagoPizzaStore = new ChiagoPizzaStore();
		PizzaStore nyPizzaStore = new NYPizzaStore();	
		
		Pizza pizza = chiagoPizzaStore.orderPizza("cheese");
		System.out.println(pizza);
		
		pizza = nyPizzaStore.orderPizza("cheese");
		System.out.println(pizza);

		
		}


}
