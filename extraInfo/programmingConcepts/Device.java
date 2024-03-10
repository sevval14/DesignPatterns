package programmingConcepts;

public abstract class Device implements Mechanism {
	//A class can implemnet many inetrface for example   Device implements Mechanism, A,B

	private String name;
	private String model;
	private double price;
	public abstract void toCharge();
	
	//Device class has many properties. for example start , restart , stop. 
	//We created function for each.This event is callled Decomposition.
	
	public void start() {
		System.out.println("press button");
	}

	@Override
	public void restart() {
		System.out.println("click restart button");
	}

	@Override
	public void stop() {
		System.out.println("click stop button");
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	// encapsulation : we determenied things we want . this clas depends on me.
	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
		else
			throw new IllegalArgumentException();
	}



}
