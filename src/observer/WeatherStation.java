package observer;

public class WeatherStation {

	public static void main(String[] args) {
		   WeatherData weatherData = new WeatherData(); // Hava verileri nesnesini oluştur
		   CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		   StatisticConditionsDisplay statisticConditionsDisplay = new StatisticConditionsDisplay(weatherData);
		   
		   weatherData.setMeasuremts(10f,10f,10f);
		  
		   

	        
	        


	}

	

}



// https://github.com/bethrobson/Head-First-Design-Patterns/blob/master/src/headfirst/designpatterns/observer/weather/ForecastDisplay.java