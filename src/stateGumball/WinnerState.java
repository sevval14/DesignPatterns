package stateGumball;

public class WinnerState implements State {
	
	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning again doesn't get you another gumball!");
		
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() == 0) {
			System.out.println("No gumball git gumball al");
			gumballMachine.setState(gumballMachine.soldOut);

		}else {
			gumballMachine.releaseBall();
			if(gumballMachine.getCount() >0) {
				gumballMachine.setState(gumballMachine.noQuarter);
			}else {
				gumballMachine.setState(gumballMachine.soldOut);

			}
		}
	}

}
