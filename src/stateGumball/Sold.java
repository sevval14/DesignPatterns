package stateGumball;

public class Sold implements State{

	GumballMachine gumballMachine;
	
	public Sold(GumballMachine gumballMachine) {
		this.gumballMachine=gumballMachine;
	}
	
	
	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}
	

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry already comlpted process");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("You can't twiceturns cranck ");		
	}

	@Override
	public void dispense() {
		System.out.println("we are doing dispense..");
		gumballMachine.releaseBall();
		
		if(gumballMachine.getCount() >0) {
			gumballMachine.setState(gumballMachine.noQuarter);	
		}else {
			gumballMachine.setState(gumballMachine.soldOut);	

		}
		
	}

}
