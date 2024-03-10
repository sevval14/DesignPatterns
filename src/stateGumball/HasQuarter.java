package stateGumball;

import java.util.Random;

public class HasQuarter implements State{
    Random winnerRandom = new Random(System.currentTimeMillis());
    
    
	GumballMachine gumballMachine;
	
	
	public HasQuarter(GumballMachine gumballMachine) {
		this.gumballMachine=gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("It dont need it. Because We have quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Yes giving  this quarter");
		gumballMachine.setState(gumballMachine.noQuarter);
	}

	@Override
	public void turnCrank() {
		System.out.println("You will turns");
		int winner =winnerRandom.nextInt(3);
		
		if(winner == 0 && (gumballMachine.getCount() >1)) {
			System.out.println("WINNER !!!");
			gumballMachine.setState(gumballMachine.getWinnerState());
		}else {
			gumballMachine.setState(gumballMachine.sold);

		}
	}

	@Override
	public void dispense() {
		System.out.println("First you should turns crank ");
	}

}
