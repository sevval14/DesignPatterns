package thread;

public class TestThreadDemo {
	
	public static void main(String[] args) {
		
		MyCounter counter = new MyCounter();

		
		for(int i=0;i<3;i++) {
			
			ThreadDemo t1 = new ThreadDemo(counter ,i);
			
			t1.start();
			/*
			 * if(t1.isAlive()) { System.out.println("Thread " +i+ " is still working ...");
			 * 
			 * }else { System.out.println("Thread " + i + " is completed");
			 * 
			 * }
			 */
			

			  try { t1.join(); //this method wait that another thread }
			  
			  }catch(InterruptedException e) {
				  e.printStackTrace(); 
			  }
		

		}

		
//		t1.run();
//		t2.run();

	
		
/*		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} */
		
		
	}

	
}
