package proxyGumballRMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMonitorTestClient {
	
	public static void main(String[] args) throws RemoteException, NotBoundException {
		
		Registry registry = LocateRegistry.getRegistry("localhost",5000);
		GumballRemote proxy = (GumballRemote) registry.lookup("Selam");
		GumballMonitor gumballMonitor = new GumballMonitor(proxy);
		
		System.out.println("Class of proxy = " +proxy.getClass());
		
		gumballMonitor.report();


		
	}

}
