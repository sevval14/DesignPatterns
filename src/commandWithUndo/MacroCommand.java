package commandWithUndo;

public class MacroCommand implements Command {
	
	Command[] command;

	public MacroCommand(Command[] command) {
		this.command = command;
	}

	@Override
	public void execute() {
		for(int i=0; i< command.length;i++) {
			command[i].execute();
		}
	}

	@Override
	public void undo() {
		for(int i=command.length - 1; i > 0 ;i--) {
			command[i].undo();
		}
	}

}
