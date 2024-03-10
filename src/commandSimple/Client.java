package commandSimple;

public class Client {
	
	public static void main(String[] args) {
		
		RemoteControl remoteControl = new  RemoteControl();
		
		Light light = new Light();
		Stereo stereo = new Stereo();
		
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		StereoOnDVDCommand stereoOnDVDCommand = new StereoOnDVDCommand(stereo);
		
		remoteControl.setCommand(lightOnCommand);
		remoteControl.buttonWasPressed();
		System.out.println("-----------------");
		
		remoteControl.setCommand(lightOffCommand);
		remoteControl.buttonWasPressed();
		System.out.println("-----------------");
		
		
		remoteControl.setCommand(stereoOnDVDCommand);
		remoteControl.buttonWasPressed();
		System.out.println("-----------------");
		
		remoteControl.setCommand(stereoOffCommand);
		remoteControl.buttonWasPressed();
		System.out.println("-----------------");
		
		
		
	}

}
