package command;

public class Stereo {
	
	int volume;
	
	public void on() {
		System.out.println("Stereo is on");
	}
	
	public void off() {
		System.out.println("Stereo is off");
	}
	
	public void setDVD() {
		System.out.println("Stereo is DVD");
	}
	
	
	public void setCD() {
		System.out.println("Stereo is CD");
	}
	
	public int setVolume(int newVolume) {
		return this.volume=newVolume;
	}

}
