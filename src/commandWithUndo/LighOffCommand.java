package commandWithUndo;

public class LighOffCommand implements Command{
	
	Light light;
	
	public LighOffCommand(Light light) {
		this.light =light;
	}

	@Override
	public void execute() {	
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
