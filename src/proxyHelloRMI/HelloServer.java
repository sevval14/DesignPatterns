package proxyHelloRMI;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
//RMI provides communication between client and server
////We apply Hello because we determine which functions become available
public class HelloServer implements Hello {
	
	@Override
	public String sayHello(String name) throws RemoteException {
		return "Server says Hi Şevval " + name;
	}

	
	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		
		HelloServer helloServer = new HelloServer();		
		Remote stub = UnicastRemoteObject.exportObject(helloServer, 3000);
		//stub is like local representation
		//UnicastRemoteObjectmakes it accessible
		Registry registry = LocateRegistry.createRegistry(3000);
		//we saved it. Some client read this name because Some client look this name then take answer
		registry.bind("Selam", stub);
		System.out.println("Hello Server is ready");
	}
}
