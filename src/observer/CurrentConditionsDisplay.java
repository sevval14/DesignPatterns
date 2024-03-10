package observer;


public class CurrentConditionsDisplay implements Observer{

	private float temperature;
	private float humidity;
	private float pressure;
	Subject subject;
	
	public CurrentConditionsDisplay(Subject subject) {
		this.subject= subject;
		subject.registerObserver(this); //this means like CurrentConditionsDisplay
	}
	


	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature =temp;
		this.humidity=humidity;
		this.pressure=pressure;
		display();
	}
	
	public  void display() {
		System.out.println("Current Conditions : \nTemp : " +  temperature +"\nHumidity : " +humidity + "\nPressure : " + pressure);
	}



	

}
