package commandDiner;

public class Waitress {
	
	Order order;
	
	public void takeOrder(Order order) {
		this.order=order;
		order.orderUp();
	}

}
