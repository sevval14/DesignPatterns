package commandSimple;

public class StereoOnDVDCommand implements Command{
	
	Stereo stereo;
	
	public StereoOnDVDCommand(Stereo stereo) {
		this.stereo=stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setDVD();
		stereo.setVolume(7);
		System.out.println(stereo.volume);
	}
	
	

}
