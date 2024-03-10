package Facade;

public class Tuner {
	
	String description;
	double frequency;
	Amplifier amplifier;

	public Tuner(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier=amplifier;
	}
	

	public void on() {
		System.out.println(description + " on");
	}
	

	public void off() {
		System.out.println(description + " off");
	}
	

	public void setFrequency(double frequency) {
		this.frequency = frequency;
		System.out.println(description + " setting frequency to " + frequency);
	}

	
	public void setAm() {
		System.out.println(description + " setting AM mode");
	}
	

	public void setFm() {
		System.out.println(description + " setting FM mode");
	}
	

	public String toString() {
		return description;
	}
}
