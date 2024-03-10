package stateGumball;

public class GumballMachine {

	State hasQuarter;
	State noQuarter;
	State sold;
	State soldOut;
	State winnerState;

	State state;


	int count=0;
	
	public GumballMachine(int count) {
		this.count=count;
		
		hasQuarter = new HasQuarter(this);
		noQuarter = new NoQuarter(this);
		sold = new Sold(this);
		soldOut = new SoldOut(this);
		winnerState = new  WinnerState(this);		
		
		if(count ==0) {
			state = soldOut;

		}else {
			state = noQuarter;

		}
		
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	private void dispense() {
		state.dispense();
	}

	public void turnCranck() {
		state.turnCrank();
		dispense();
	}

	public void reFill(int newGumball) {
		this.count +=newGumball;
	}
	
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if(count > 0) {
			count--;
		
		}else {
			System.out.println("Gumball is sold out sorry");
		}
		
	}
	public int getCount() {
		return count;
		
	}
	
	public State getState() {
		return state;
	}
	
	public State getWinnerState() {
		return winnerState;
	}

	public void setState(State state) {
		this.state = state;
	}
	

}
