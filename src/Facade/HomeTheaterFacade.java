package Facade;

public class HomeTheaterFacade {

	Amplifier amplifier;
	Projector projector;
	Screen screen;
	StreamingPlayer player;
	Tuner tuner;
	
	
	public HomeTheaterFacade(Amplifier amplifier, Projector projector, Screen screen, StreamingPlayer player,
			Tuner tuner) {
		this.amplifier = amplifier;
		this.projector = projector;
		this.screen = screen;
		this.player = player;
		this.tuner = tuner;
	}
	
	
	public void watchMovie() {
		 System.out.println("Get ready to watch a movie...");
		 amplifier.on();
		 projector.on();
		 screen.down();
		 player.on();

	}
	
	
	
	public void endMovie() {
		 System.out.println("Get ready to watch a movie...");
		 amplifier.off();
		 projector.off();
		 screen.up();
		 player.off();

	}
}
