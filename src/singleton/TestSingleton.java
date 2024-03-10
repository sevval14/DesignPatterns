package singleton;

public class TestSingleton {

	public static void main(String[] args) {
			
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();


		if(singleton == singleton1) {
			System.out.println("These values are same");
		}else {
			System.out.println("These values are diffrent");

		}
		
		
	}
}
