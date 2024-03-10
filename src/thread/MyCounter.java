package thread;

public class MyCounter {
	
	int  counter =0;
	
	public  void increment() {
		counter++;
	}
	
	//synchronized koymazsam race condition oluşabilir
	
	public  int getCounter() {
		return counter;
	}

}
