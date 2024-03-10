package command;

public class Client {
	
	public static void main(String[] args) {
		
		RemoteControl remoteControl = new  RemoteControl();
		
		Light light = new Light();
		Stereo stereo = new Stereo();
		
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		StereoOnDVDCommand stereoOnDVDCommand = new StereoOnDVDCommand(stereo);
		
		remoteControl.setCommand(1,lightOnCommand,lightOffCommand);
		remoteControl.buttonOnWasPressed(1);
		System.out.println("-----------------");
		remoteControl.buttonOffWasPressed(1);
		System.out.println("-----------------\n");
		
		
		remoteControl.setCommand(2,stereoOnDVDCommand,stereoOffCommand);
		remoteControl.buttonOnWasPressed(2);
		System.out.println("-----------------");
		remoteControl.buttonOffWasPressed(2);
		System.out.println("-----------------\n");
		
		remoteControl.buttonOnWasPressed(1);
		System.out.println("-----------------");
		remoteControl.buttonOffWasPressed(1);
		System.out.println("-----------------\n");
		
		
		
	}

}
