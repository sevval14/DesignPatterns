package commandWithUndo;

public class LighOnCommand implements Command{
	
	Light light;
	
	public LighOnCommand(Light light) {
		this.light =light;
	}

	@Override
	public void execute() {	
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

}
