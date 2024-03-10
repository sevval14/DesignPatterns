package Facade;

public class Amplifier {
	
	String description;
	Tuner tuner;
	StreamingPlayer player;

	public Amplifier(String description) {
		this.description=description;
	}

	public void on() {
		System.out.println(description + " on");
	}
	
	public void off() {
		System.out.println(description + " off");
	}
	
	 
	public void setStereoSound() {
			System.out.println(description + " stereo mode on");
	}
	 
	public void setSurroundSound() {
			System.out.println(description + " surround sound on (5 speakers, 1 subwoofer)");
	}
	 
	public void setVolume(int level) {
			System.out.println(description + " setting volume to " + level);
	}
		
	public void setTuner(Tuner tuner) {
		this.tuner=tuner;
		System.out.println(description + " set tuner " + tuner);
	}
	
	public void setPlayer(StreamingPlayer player) {
		this.player=player;
		System.out.println(description + " set player " + player);
	}
	

}
