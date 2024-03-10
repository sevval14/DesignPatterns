package commandWithUndo;

public class RemoteControl {

	Command[] onCommand ;
	Command[] offCommand;
	Command undoCommand;
	
	public RemoteControl() {
		onCommand= new Command[7];
		offCommand= new Command[7];
		
		NoCommand noCommand = new NoCommand();
		for(int i=0;i<7;i++) {
			onCommand[i]=noCommand;
			offCommand[i]=noCommand;
		}
		undoCommand =noCommand;
	}
	
	public void setCommand(int slot, Command onCom,Command offCom) {
		onCommand[slot]=onCom;
		offCommand[slot]=offCom;
	}
	
	public void buttonOnPressed(int slot) {
		onCommand[slot].execute();
		undoCommand = onCommand[slot];
	}
	
	public void buttonOffPressed(int slot) {
		offCommand[slot].execute();
		undoCommand = offCommand[slot];

	}
	
	public void buttonUndoPressed(int slot) {
		undoCommand.undo();
	}
}
