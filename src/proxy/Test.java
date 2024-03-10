package proxy;

public class Test {

	public static void main(String[] args) {
		
		int count=0;
		
		if(args.length > 2) {
			 System.out.println("GumballMachine <location> <count>");
			 System.exit(1);

		}

		
		count = Integer.parseInt(args[1]);
        
        		
		GumballMachine gumballMachine = new GumballMachine(args[0], count);
		
		GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
		
		gumballMonitor.report();
	}
}
