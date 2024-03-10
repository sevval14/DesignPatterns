package stateGumball;

public class GumballTest {

	public static void main(String[] args) {
		
		GumballMachine gumballMachine = new GumballMachine(5);
		
		gumballMachine.ejectQuarter();
		System.out.println("---------------------------");
		
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		System.out.println(gumballMachine.getCount());
		System.out.println("---------------------------");
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCranck();
		System.out.println(gumballMachine.getCount());
		System.out.println("---------------------------");
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCranck();
		System.out.println(gumballMachine.getCount());
		System.out.println("---------------------------");
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCranck();
		System.out.println(gumballMachine.getCount());
		System.out.println("---------------------------");
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCranck();
		System.out.println(gumballMachine.getCount());
		System.out.println("---------------------------");
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCranck();
		System.out.println(gumballMachine.getCount());
		System.out.println("---------------------------");
	}
}
