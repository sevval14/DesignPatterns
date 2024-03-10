package commandDiner;

public class TestCommandDiner {

	public static void main(String[] args) {
		Waitress waitress = new Waitress();
		Customer customer = new Customer(waitress);
		Cook cook = new Cook();
		BurgerAndFries burgerAndFries = new BurgerAndFries(cook);
		
		customer.createOrder(burgerAndFries);
	}
}
