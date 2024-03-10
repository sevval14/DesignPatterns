package observer;

public class StatisticConditionsDisplay implements Observer  {
	

		private float temperature;
		private float humidity;
		private float pressure;
		Subject subject;
		
		public StatisticConditionsDisplay(Subject subject) {
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

			System.out.println("Temp : " +  temperature +"\nHumidity : " +humidity + "\nPressure : " + pressure);
		}








	

}
