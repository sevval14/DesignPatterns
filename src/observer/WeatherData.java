package observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
	
	
	private float temperature;
	private float humidity;
	private float pressure;
	public ArrayList<Observer> observers = new ArrayList<Observer>();
	
	
	@Override
	public void registerObserver(Observer observer) {
		
		  if (!observers.contains(observer)) {
	            this.observers.add(observer);
	        }	}
	
	
	@Override
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if(i>0) {		
			observers.remove(i);		

		}
	}
	@Override
	public void notifyObserver() {
		for(Observer observer : observers) {
			observer.update(temperature, humidity, pressure);

		}
//		for (int i =0; i<observers.size();i++) {	
//			Observer observer = (Observer)observers.get(i);
//			observer.update(temperature, humidity, pressure);
//		}
	}

	
	public void setMeasuremts(float temp, float humidity, float pressure) {
		this.temperature=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		notifyObserver();

	}

	
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float barometricPressure) {
		this.pressure = barometricPressure;
	}

}
