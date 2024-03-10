package proxy;

public class GumballMonitor {

	GumballMachine gumballMachine;
	
	public GumballMonitor(GumballMachine gumballMachine) {
		this.gumballMachine=gumballMachine;
	}
	
	public void report() {
		System.out.println("Location : " + gumballMachine.getLocation());
		System.out.println("Count : " + gumballMachine.getCount());

	}
}

//Proxy deseni, gerçek nesneye doğrudan erişim yerine bir aracı (proxy) üzerinden erişim sağlayarak, sistemdeki soyutlamayı ve modülerliği artırır. 