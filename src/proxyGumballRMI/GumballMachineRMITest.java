package proxyGumballRMI;
import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachineRMITest {
	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		
		int count =0;
		
		if (args.length < 1) {
			System.out.println("GumballMachine <count>");
 			System.exit(1);
		}
		
		count = Integer.parseInt(args[0]);

		GumballMachine gumballMachine = new GumballMachine(count);
	
		
		Remote stub = UnicastRemoteObject.exportObject(gumballMachine, 5000);

		Registry registry = LocateRegistry.createRegistry(5000);
		registry.bind("Selam", stub);
		System.out.println("Machine Server is ready");

	}

}
