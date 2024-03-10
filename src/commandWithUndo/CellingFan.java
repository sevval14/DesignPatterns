package commandWithUndo;

public class CellingFan {
	
	 public static final int HIGH = 3;
	 public static final int MEDIUM = 2;
	 public static final int LOW = 1;
	 public static final int OFF = 0;

	 String location;
	 int speed;
	 
	 public CellingFan(String location, int speed) {
		this.location = location;
		this.speed = speed;
	 }
	 
	 public  void high() {
		 speed=HIGH;
		 System.out.println("high");
	}
	 
	public  void low() {
		 speed=LOW;
		 System.out.println("low");

	}
	
	 public  void medium() {
		 speed=MEDIUM;
		 System.out.println("medium");

	}
	 
	 public  void off() {
		 speed=OFF;
		 System.out.println("off");

	}
	 
	public int getSpeed() {
		return speed;
	}
	 
}
