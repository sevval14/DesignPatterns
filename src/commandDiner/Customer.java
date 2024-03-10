package commandDiner;

public class Customer {
	
	Waitress waitress;
	Cook cook;
	Order order;
	
	public Customer(Waitress waitress) {
		this.waitress = waitress;
	}
	
	public void createOrder(Order order) {
		this.order=order;
		waitress.takeOrder(order);
	}
	
	

}
