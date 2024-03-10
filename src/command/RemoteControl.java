package command;

public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		NoCommand noCommand = new NoCommand();
		for(int i =0;i>7;i++) {
			onCommands[i]=noCommand;
			offCommands[i]=noCommand;
			
		}
		undoCommand =noCommand;
		
		
	}
	
	public void setCommand(int slot ,Command oncommand,Command offcommand) {
		onCommands[slot] =oncommand;
		offCommands[slot] =offcommand;

	}
	
	public void buttonOnWasPressed(int slot) {
		onCommands[slot].execute();
		undoCommand=onCommands[slot];
	}
	
	
	public void buttonOffWasPressed(int slot) {
		onCommands[slot].undo();
		undoCommand= offCommands[slot];
	}
	
	public void buttonUndoWasPressed(int slot) {
		undoCommand.undo();
	}
}
