package thread;

public class ThreadDemo extends Thread{
	
	//instead extends Thread . we can use implemnets Runnable
	
	MyCounter myCounter;
	public int  threadNumber;
	
	public ThreadDemo(MyCounter counter , int threadNumber) {
		this.myCounter= counter;
		this.threadNumber = threadNumber;
	}
	
	@Override
	public void run() {
					
		for(int i =0; i<5;i++) {
			myCounter.increment();
			System.out.println(Thread.currentThread().getName() + " Counter value : " + myCounter.getCounter() );
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		}

	}
	


}
