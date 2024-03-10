package proxyGumballRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface GumballRemote extends Remote{
	
	int getCount() throws RemoteException;

}
