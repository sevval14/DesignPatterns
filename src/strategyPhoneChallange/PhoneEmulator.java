package strategyPhoneChallange;

import java.util.Scanner;

public class PhoneEmulator {
	
	public static void main(String[] args) {
		
		PhoneCameraApp basicPhone = new BasicPhone();	
		
		String share = getSharing();
		
		switch(share) {
			case("t"): basicPhone.setShareStrategy(new Text());break;
			case("s"): basicPhone.setShareStrategy(new Social());break;
			case("e"): basicPhone.setShareStrategy(new Email());break;
			default:
				System.out.println("Please enter valid letter (e,t,s) default shareing sytem is Text\n");
				basicPhone.setShareStrategy(new Text());

		}
		
		basicPhone.take();
		basicPhone.edit();
		basicPhone.save();
		basicPhone.share();
		
		

	}
	
	//We use static because of that . we dont needo to create object to another class
	public static String getSharing() {
		//System.in read infromation come from keyboard
		//System.out is like sysout. it used to output
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Share with txt (t), email (e), or social media (s)?");
		//This next method read word during empty or new line.
		String appName = scanner.next();
		scanner.close();
		return appName;
	}

}
