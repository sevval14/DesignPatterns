package stateFirstGumball;

public class GumballTestDrive {

	public static void main(String[] args) {
		
		GumballMachine gumballMachine = new GumballMachine(5);
		
		gumballMachine.insertQuaerter();
		gumballMachine.ejectsQuaerter();
		gumballMachine.ejectsQuaerter();
		gumballMachine.turnsCrank();
		System.out.println(gumballMachine.count);

		
		System.out.println("-----------------------------------------");
		
		gumballMachine.insertQuaerter();
		gumballMachine.turnsCrank();
		System.out.println(gumballMachine.count);
		
		
	}
}
