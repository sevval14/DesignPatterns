package commandWithUndo;

public class TestClient {
	
	public static void main(String[] args) {
		RemoteControl remoteControl = new  RemoteControl();
		Light light = new Light();
		CellingFan ceilingFan= new CellingFan("Living Room",2);

		LighOnCommand lighOnCommand = new LighOnCommand(light);
		LighOffCommand lighOffCommand = new  LighOffCommand(light);
		CellingFanOnCommand ceilingFanOn = new CellingFanOnCommand(ceilingFan);
		CellingFanOffCommand ceilingFanOff = new CellingFanOffCommand(ceilingFan);

		
		remoteControl.setCommand(0, lighOnCommand, lighOffCommand);
		remoteControl.setCommand(1, ceilingFanOn, ceilingFanOff);

		remoteControl.buttonOnPressed(0);
		remoteControl.buttonOffPressed(0);
		remoteControl.buttonUndoPressed(0);
		System.out.println("--------------------------");
		
		remoteControl.buttonOnPressed(1);
		remoteControl.buttonOffPressed(1);
		System.out.println("--------------------------");

		
		Command[] partyOn = {lighOnCommand,ceilingFanOn};
		Command[] partyOff = {lighOffCommand,ceilingFanOff};
		
		MacroCommand partyOnCommand = new MacroCommand(partyOn);
		MacroCommand partyOffCommand = new MacroCommand(partyOff);


		remoteControl.setCommand(2, partyOnCommand, partyOffCommand);
		remoteControl.buttonOnPressed(2);
		remoteControl.buttonOffPressed(2);



	}

}
