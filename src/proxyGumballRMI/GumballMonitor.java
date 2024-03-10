package proxyGumballRMI;

import java.rmi.RemoteException;

public class GumballMonitor {
	
	GumballRemote gumballRemote;
	
	public GumballMonitor(GumballRemote gumballRemote) {
		this.gumballRemote = gumballRemote;
	}
	
	public void report() throws RemoteException {
		System.out.println("Count : " + gumballRemote.getCount());
	}

}
