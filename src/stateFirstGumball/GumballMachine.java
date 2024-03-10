package stateFirstGumball;

public class GumballMachine {

	public static int SOLD_OUT =0;
	public static int HAS_QUAERTER =1;
	public static int NO_QUAERTER =2;
	public static int SOLD =3;
	
	int state = SOLD_OUT;
	
	int count =0;
	
	public GumballMachine(int count) {
		this.count=count;
		if(count > 0) {
			state = NO_QUAERTER;
		}
	}
	
	public void insertQuaerter() {
		if(state == HAS_QUAERTER) {
			System.out.println("You can’t insert another quarter”");
		}else if(state == NO_QUAERTER) {
			System.out.println("You insersted quarter");
			state =HAS_QUAERTER;
		}else if(state == SOLD_OUT) {
			System.out.println("There are no gumballs. Machine is sold out");
		}else if(state == SOLD){
			System.out.println("Please wait. we’re already giving you a gumball");
		}
	}
	
	
	public void ejectsQuaerter() {
		if(state == HAS_QUAERTER) {
			System.out.println("We are giving your quarter”");
			state = NO_QUAERTER;
		}else if(state == NO_QUAERTER) {
			System.out.println("You haven't inserted a quarter");
		}else if(state == SOLD_OUT) {
			System.out.println("You can't eject, you haven't inserted a quarter yet");
		}else if(state == SOLD){
			System.out.println("Sorry, you already turned the crank");
		}
	}

	
	public void turnsCrank() {
		if(state == HAS_QUAERTER) {
			System.out.println("You turned...");
			state =SOLD;
			dispense();
		}else if(state == NO_QUAERTER) {
			System.out.println("You turned but there’s no quarter");
		}else if(state == SOLD_OUT) {
			System.out.println("You turned but Machine is sold out");
		}else if(state == SOLD){
			System.out.println("You alreday turned.Turning twice doesn’t get you another gumball!");
		}
	}

	private void dispense() {
		//dağıtıyo
		if(state == HAS_QUAERTER) {
			System.out.println("You should turn crank. No gumball dispensed");
			state =SOLD;
		}else if(state == NO_QUAERTER) {
			System.out.println("there’s no quarter.");
		}else if(state == SOLD_OUT) {
			System.out.println("Sorry Machine is sold out");
		}else if(state == SOLD){
			System.out.println("A gumball comes rolling out the slot");
			count --;
			if(count == 0) {
				 System.out.println("Oops, out of gumballs!");
				 state = SOLD_OUT;
			}else {
				state=NO_QUAERTER;
			}
		}
	}
	
	public void reFill(int newGumball) {
		this.count +=newGumball;
		state=NO_QUAERTER;

	}


	
}
