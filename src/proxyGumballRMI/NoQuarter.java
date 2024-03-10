package proxyGumballRMI;

public class NoQuarter implements State{

	transient GumballMachine gumballMachine;
	
	public NoQuarter(GumballMachine gumballMachine) {
		this.gumballMachine=gumballMachine;
	}
	
	
	
	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.hasQuarter);
	}

	@Override
	public void ejectQuarter() {
		System.out.println("We dont have quarter");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("Please should add quarter for turns");
	}

	@Override
	public void dispense() {
		System.out.println("Please should add quarter for dispense");
		
	}

}
