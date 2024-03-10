package programmingConcepts;

public class Phone extends Device {
	//extends word ensure to implement inheritance
	
	//There is start method inside Device class but I want to create again
	//I don't need to write override but i want it
	@Override
	public void start() {
		System.out.println("hold button for phone extra override ettim");
	}

	@Override
	public void toCharge() {
		System.out.println("charge with usb cable");		
		
	}

	@Override
	public  String count() {
		return "Default ama ben istsem yine değiştirirm Phonenun içinde override ederek";
	}
	
}
