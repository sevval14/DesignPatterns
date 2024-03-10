package proxyHelloRMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloClient{

	public static void main(String[] args) throws RemoteException, NotBoundException {
		
		Registry registry = LocateRegistry.getRegistry("localhost", 3000);
		Hello proxy = (Hello) registry.lookup("Selam");
		
		System.out.println("Class of proxy = " +proxy.getClass());
		
		String response = proxy.sayHello("Özekinci");
		//sunucudan sayHelloyu aldık ve uzerine calistiridk
		System.out.println("Response : " + response);
		
	}
}
