package singleton;

public class Singleton {

	private static Singleton uniSingleton;
	
	private Singleton() {};
	
	public static Singleton getInstance() {
		if(uniSingleton==null) {
			uniSingleton=new  Singleton();
		}
		return uniSingleton;
	}
}
