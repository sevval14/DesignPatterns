package Facade;

public class TestDriver {
	public static void main(String[] args) {
		
		Amplifier amplifier = new Amplifier("Amplifier");
		StreamingPlayer player = new  StreamingPlayer("Stremaing player ", amplifier);
		Tuner tuner = new Tuner("Tuner", amplifier);
		Projector projector = new Projector("projector", player);
		Screen screen = new Screen("screen");
		
		HomeTheaterFacade facade = new HomeTheaterFacade(amplifier, projector, screen, player, tuner);
		facade.watchMovie();

		
	}

}
