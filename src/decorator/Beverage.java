package decorator;

public abstract class Beverage {
	 String description = "-";

	public enum Size { TALL, GRANDE, VENTI };
	
	private Size  size ;
	
 
	 public Size getSize() {
		return size;
	}


	public void setSize(Size size) {
		this.size = size;
	}


	public abstract double cost();
	
	 
	 public String getDescription() {
		 return description;
	 }
	 

}
