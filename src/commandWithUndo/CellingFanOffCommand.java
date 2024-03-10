package commandWithUndo;

public class CellingFanOffCommand implements Command{
	
	 CellingFan cellingFan;
	 int speed;
	
	public CellingFanOffCommand(CellingFan cellingFan) {
		this.cellingFan =cellingFan;
	}

	@Override
	public void execute() {	
		speed=cellingFan.getSpeed();
		cellingFan.off();
	}

	@Override
	public void undo() {
		cellingFan.off();
		switch (speed) {
			case CellingFan.HIGH: 	cellingFan.high(); break;
			case CellingFan.MEDIUM: cellingFan.medium(); break;
			case CellingFan.LOW: 	cellingFan.low(); break;
			default: 				cellingFan.high(); break;

		}
	}

}
