package strategyPhoneChallange;

public abstract class PhoneCameraApp {
	 ShareStrategy shareStrategy;
	 
	 public void setShareStrategy(ShareStrategy shareStrategy) {
		this.shareStrategy = shareStrategy;
	}
	 
	 public void share() {
		 shareStrategy.share();
	}
	 
	 public void take() {
		 System.out.println("I am taking photo");
	}
	 
	 public void save() {
		 System.out.println("I am saving photo");
	}

	public abstract void edit();
}
