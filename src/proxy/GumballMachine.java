package proxy;


public class GumballMachine {

	String location;
	int count;

	
	public GumballMachine(String location, int count) {
		this.count=count;
		this.location=location;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCount() {
		return count;
	}


	
	
}
