package observer;

public class ForecastDisplay {
	
	WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData  = weatherData;

	}
	
	
	public  void display() {

		System.out.println("Temp : " +  weatherData.getTemperature() +"\nHumidity : " + weatherData.getHumidity() + "\nPressure : " + weatherData.getPressure());
	}





	

}
