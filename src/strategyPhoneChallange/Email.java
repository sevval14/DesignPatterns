package strategyPhoneChallange;

public class Email implements ShareStrategy {

	@Override
	public void share() {
		System.out.println("Email");
	}

}
